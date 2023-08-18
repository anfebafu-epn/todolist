<?php

/**
 * Created by IntelliJ IDEA.
 * User: Andrés
 * Date: 1/9/2017
 * Time: 15:56
 */

require 'Conectores/Conectar.class.php';
require 'Conectores/ConectarPG.class.php';
require 'Conectores/ConectarSQL.class.php';
require 'Conectores/ConectarOracle.class.php';
error_reporting(E_ERROR | E_WARNING | E_PARSE);


class cornerstone_orm_client_Connector
{
    protected static $lob;
    protected static $lobOra=false;
    protected static $lobOraValue;
    protected static $sqlEncripter;
    protected static $countBlob=0;
    protected static $blobArray;
    protected static $blobArrayIndex;

    public function __construct(){}
    static $__rtti = "<class path=\"cornerstone.orm.client.Connector\" params=\"\">\x0A\x09<Execute public=\"1\" set=\"method\" line=\"9\" static=\"1\"><f a=\"SQL:Parameters\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<x path=\"Void\"/>\x0A</f></Execute>\x0A\x09<Queue public=\"1\" set=\"method\" line=\"13\" static=\"1\"><f a=\"SQL:Parameters:queue\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.QueueItem\"/></c>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.QueueItem\"/></c>\x0A</f></Queue>\x0A\x09<ExecuteQueue public=\"1\" set=\"method\" line=\"25\" static=\"1\"><f a=\"queue\">\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.QueueItem\"/></c>\x0A\x09<x path=\"Void\"/>\x0A</f></ExecuteQueue>\x0A\x09<ReadValue public=\"1\" set=\"method\" line=\"31\" static=\"1\"><f a=\"SQL:Parameters\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<d/>\x0A</f></ReadValue>\x0A\x09<ReadTable public=\"1\" set=\"method\" line=\"35\" static=\"1\"><f a=\"SQL:Parameters\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<c path=\"cornerstone.orm.client.DataTable\"/>\x0A</f></ReadTable>\x0A\x09<Read public=\"1\" params=\"T\" set=\"method\" line=\"40\" static=\"1\"><f a=\"SQL:Parameters:cl:?orm\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<x path=\"Class\"><c path=\"Read.T\"/></x>\x0A\x09<c path=\"cornerstone.orm.ORM\"/>\x0A\x09<c path=\"Array\"><c path=\"Read.T\"/></c>\x0A</f></Read>\x0A\x09<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"45\" static=\"1\"><f a=\"SQL:Parameters:cl:?orm\">\x0A\x09<c path=\"String\"/>\x0A\x09<c path=\"Array\"><c path=\"cornerstone.orm.client.Parameter\"/></c>\x0A\x09<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\x0A\x09<c path=\"cornerstone.orm.ORM\"/>\x0A\x09<c path=\"ReadOne.T\"/>\x0A</f></ReadOne>\x0A\x09<meta>\x0A\x09\x09<m n=\":directlyUsed\"/>\x0A\x09\x09<m n=\":keepSub\"/>\x0A\x09\x09<m n=\":rtti\"/>\x0A\x09</meta>\x0A</class>";
    static function Execute($SQL, $Parameters) {
        return self::Run($SQL,$Parameters,"NonQuery",null);
    }
    static function Queue($SQL, $Parameters, $queue) {
        if($queue === null) {
            $queue = new _hx_array(array());
        }
        $item = new cornerstone_orm_client_QueueItem();
        $item->set_SQL($SQL);
        $item->set_Parameters($Parameters);
        $queue->push($item);
        return $queue;
    }
    static function ExecuteQueue($queue) {
        $_g = 0;
        while($_g < $queue->length) {
            $item = $queue[$_g];
            $_g = $_g + 1;
            $tmp = $item->get_SQL();
            cornerstone_orm_client_Connector::Execute($tmp, $item->get_Parameters());
            unset($tmp,$item);
        }
    }
    static function ReadValue($SQL, $Parameters) {
        return self::Run($SQL,$Parameters,"Scalar",null);
    }
    static function ReadTable($SQL, $Parameters) {
        return self::Run($SQL,$Parameters,"Datatable",null);
    }
    static function Read($SQL, $Parameters, $cl, $orm = null) {

        return self::Run($SQL,$Parameters,"ObjectArray",$cl);
    }
    static function ReadOne($SQL, $Parameters, $cl, $orm = null) {
        return self::Run($SQL,$Parameters,"SingleObject",$cl);
    }
    function __toString() { return 'cornerstone.orm.client.Connector'; }

    static function Run($sql,$parameters,$operation,$class){


        $data=cornerstone_integrator_configuration_Configuration::$Data->get_DatabaseConnections();
        $dcd = new cornerstone_integrator_configuration_DatabaseConnectionData();
        $dcd=$data[0];//asigno el objeto de la coneccion
        $dateBase=$dcd->get_DatabaseEngine();
        $url_Coneccion=$dcd->get_ConnectionString();
        $user=$dcd->get_UserID();
        $password=$dcd->get_Password();
        $dbName=$dcd->get_Database();
        $adicionalConf=$dcd->get_OtherParameters();
        $serverPort=$dcd->get_ServerPort();
        switch ($dateBase) {
            case cornerstone_integrator_configuration_DatabaseEngineEnum::$MYSQL:
                return self::processMYSQL($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class);
                break;
            case cornerstone_integrator_configuration_DatabaseEngineEnum::$POSTGRESQL:
                return self::processPOSTGRES($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicionalConf);
                break;
            case cornerstone_integrator_configuration_DatabaseEngineEnum::$SQLSERVER:
                return self::processSQLSERVER($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicionalConf);
                break;
            case cornerstone_integrator_configuration_DatabaseEngineEnum::$ORACLE:
                return self::processORACLE($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicionalConf);
                break;
        }
    }

    static function processMYSQL($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class){
        $con = new Conectar($url_Coneccion,$serverPort,$user,$password,$dbName);//Instancio la clase y creo la coneccion
        $conn=$con->TomarConeccion();
        $parmetersCast=self::cast_parameters($parameters);
        //Proceso de decodificacion de Sentencia SQL ya que sqlsrv acepta como parametros la sentencia ? mientras que ORM
        //Los devuelve como :, se hace un proceso de castin de parametros
        $sqlCast=str_replace("\"","",$sql);
        $parametersNum=$parameters->length;
        for ($i = 1; $i <= $parametersNum; $i++) {
            $sqlCast=str_replace(":P$i","?",$sqlCast);
            $sqlCast=str_replace("@P$i","?",$sqlCast);
        }

        if ($stmt = $conn->prepare($sqlCast)) {
            /* use call_user_func_array, as $stmt->bind_param('s', $param); does not accept params array */
            @call_user_func_array(array($stmt, 'bind_param'), $parmetersCast);
        }else{
            trigger_error('Wrong SQL: ' . $sqlCast . ' Error: ' . self::$connection->errno . ' ' . self::$connection->error, E_USER_ERROR);
            return false;
        }

        switch ($operation) {
            case "NonQuery":
                $sizeblob=count(self::$blobArray);
                for($i=0;$i<$sizeblob;++$i){
                    $stmt->send_long_data(self::$blobArrayIndex[$i], self::$blobArray[$i]);
                }
                $stmt->execute();
                $con->desconectarBD();
                return null;
                break;
            case "Scalar":
                $resultado = $stmt->execute();
                $last_id = $conn->insert_id;
                $con->desconectarBD();
                return $last_id;
                break;
            case "Datatable":
                $stmt->execute();
                $result = $stmt->get_result();
                $resp = self::ConvertToHaxeDataTable($result);
                mysqli_free_result($result);
                $con->desconectarBD();
                return $resp;
                break;
            case "SingleObject":
                $laClase = self::ClassDecoder($class);
                $stmt->execute();
                $result = $stmt->get_result();
                $fields = self::Fields($laClase);
                $c = count($fields);
                $count = 0;
                $cls = self::ClassDecoder($class);
                $fieldinfo=mysqli_fetch_fields($result);

                while ($R = $result->fetch_array(MYSQLI_BOTH)) {
                    $cls= self::ClassDecoder($class);
                    for($i=0;$i<$c;++$i){
                        $valor=$R[$fields[$i]];
                        //recorro los resultados para encontrar el tipo de datos
                        $tipo_campo=0;
                        $maxlength=0;
                        foreach ($fieldinfo as $val) {
                            if($val->name==($fields[$i])){
                                $tipo_campo=$val->type;
                                $maxlength=$val->max_length;
                            }
                        }
                        switch ($tipo_campo){
                            case 16:
                            case 1:
                            case 2:
                            case 9:
                            case 3:
                            case 8:
                            case 3:
                            case 5:
                            case 246:
                                $cls->{$fields[$i]} = $valor;//tipos numericos
                                break;
                            case 10:
                            case 12:
                            case 7:
                            case 11;
                            case 13;
                                try {
                                    $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal, sino la encripto como Date
                                    if ($date == null || $date == '') {
                                        $cls->{$fields[$i]} = $valor;
                                    } else {
                                        $cls->{$fields[$i]} = Date::fromString($valor);
                                    }
                                } catch (Exception $e) {
                                    $cls->{$fields[$i]} = $valor;
                                }
                                break;
                            case 254:
                            case 253://tipos String
                                $cls->{$fields[$i]} = utf8_encode($valor);
                                break;
                            case 249:
                            case 250:
                            case 251:
                            case 252://tipos Blob
                                $tama_max=$maxlength;
                                $objeto2 = new php__BytesData_Wrapper($valor);
                                $objeto = new haxe_io_Bytes($tama_max, $objeto2);
                                $cls->{$fields[$i]} = $objeto;
                                break;
                            default:
                                $cls->{$fields[$i]} = $valor;
                        }
                    }
                    break;
                }
                $con->desconectarBD();
                mysqli_free_result($result);
                return $cls;
                break;
            case "ObjectArray":
                $laClase = self::ClassDecoder($class);
                $stmt->execute();
                $result = $stmt->get_result();
                $fields = self::Fields($laClase);
                $c = count($fields);
                $resultArray = Array();
                $count = 0;
                $fieldinfo=mysqli_fetch_fields($result);
                while ($R = $result->fetch_array(MYSQLI_BOTH))
                {
                    $cls= self::ClassDecoder($class);
                    for($i=0;$i<$c;++$i){
                        $valor=$R[$fields[$i]];
                        //recorro los resultados para encontrar el tipo de datos
                        $tipo_campo=0;
                        $maxlength=0;
                        foreach ($fieldinfo as $val) {
                            if($val->name==($fields[$i])){
                                $tipo_campo=$val->type;
                                $maxlength=$val->max_length;
                            }
                        }
                        switch ($tipo_campo){
                            case 16:
                            case 1:
                            case 2:
                            case 9:
                            case 3:
                            case 8:
                            case 3:
                            case 5:
                            case 246:
                                $cls->{$fields[$i]} = $valor;//tipos numericos
                                break;
                            case 10:
                            case 12:
                            case 7:
                            case 11;
                            case 13;
                                try {
                                    $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal, sino la encripto como Date
                                    if ($date == null || $date == '') {
                                        $cls->{$fields[$i]} = $valor;
                                    } else {
                                        $cls->{$fields[$i]} = Date::fromString($valor);
                                    }
                                } catch (Exception $e) {
                                    $cls->{$fields[$i]} = $valor;
                                }
                                break;
                            case 254:
                            case 253://tipos String
                                $cls->{$fields[$i]} = utf8_encode($valor);
                                break;
                            case 249:
                            case 250:
                            case 251:
                            case 252://tipos Blob
                                $tama_max=$maxlength;
                                $objeto2 = new php__BytesData_Wrapper($valor);
                                $objeto = new haxe_io_Bytes($tama_max, $objeto2);
                                $cls->{$fields[$i]} = $objeto;
                                break;
                            default:
                                $cls->{$fields[$i]} = $valor;
                        }
                    }
                    $resultArray[$count]=$cls;
                    $count++;
                }
                mysqli_free_result($result);
                $con->desconectarBD();
                return new _hx_array($resultArray);
                break;
        }
    }

    static function processPOSTGRES($url_Coneccion,$serverPort,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicinalConf){

        //Codificacion de FROM para POSTGRES Ya que la cadena admitida solo toma el nombre de las tablas con ""
        //self::$sqlEncripter=self::postgresQueryCast($sql);
        self::$sqlEncripter=$sql;
        $parametersNum=$parameters->length;
        for ($i = 1; $i <= $parametersNum; $i++) {
            self::$sqlEncripter=str_replace(":P$i","$$i",self::$sqlEncripter);
            self::$sqlEncripter=str_replace("@P$i","$$i",self::$sqlEncripter);
        }
        $con = new ConectarPG($url_Coneccion,$serverPort,$user,$password,$dbName);//Instancio la clase y creo la coneccion
        $conn=$con->TomarConeccion();
        $parmetersCast=self::cast_parametersPG($parameters);
        $sqlName = 'selectUserByCode';
        if (!pg_prepare ($sqlName, self::$sqlEncripter)) {
            die("Can't prepare 'die(\"Can't prepare ".self::$sqlEncripter.": \" . pg_last_error());': " . pg_last_error());
            return false;
        }

        switch ($operation) {
            case "NonQuery":
                try {
                    $stmt = pg_execute($sqlName, $parmetersCast);
                }catch (Exception $e){
                    print_r("\n Error \n");
                    print_r($e);
                }
                $con->desconectarBD();
                return null;
                break;
            case "Scalar":
                $stmt = pg_execute($sqlName, $parmetersCast);
                $insert_query = pg_query("SELECT lastval();");
                $insert_row = pg_fetch_row($insert_query);
                $insert_id = $insert_row[0];
                $con->desconectarBD();
                return $insert_id;
                break;
            case "Datatable":
                $stmt = pg_execute($sqlName, $parmetersCast);
                $resp=self::ConvertToHaxeDataTablePG($stmt);
                $con->desconectarBD();
                return $resp;
                break;
            case "SingleObject":
                $laClase=self::ClassDecoder($class);
                $stmt = pg_execute($sqlName, $parmetersCast);
                $fields=self::Fields($laClase);
                $c=count($fields);
                $cls= self::ClassDecoder($class);
                //numero de filas devueltas en consulta
                $pgn = pg_num_fields($stmt);
                while ($R = pg_fetch_array($stmt,null, PGSQL_BOTH))
                {
                    $cls=self::ClassDecoder($class);
                    for($i=0;$i<$c;++$i) {

                        $dataType="";
                        //recorro el numero de filas devueltas
                        for($j=0;$j<$pgn;++$j) {
                            if(pg_field_name($stmt, $j)==$fields[$i]){
                                $dataType= pg_field_type($stmt, $j);
                                break;
                            }
                        }
                        $valor = $R[$fields[$i]];
                        if (!is_null($valor)) {//si el valor devuelto no es null
                            switch ($dataType) {
                                case "character":
                                case "char":
                                case "text":
                                case "uuid":
                                case "character varying":
                                case "varchar":
                                case "xml":
                                    $cls->{$fields[$i]} = utf8_encode($valor);
                                    break;
                                case "real":
                                case "double precision":
                                case "inet":
                                case "smallint":
                                case "smallserial":
                                case "integer":
                                case "serial":
                                case "int4range":
                                case "bigint":
                                case "bigserial":
                                case "int8range":
                                case "decimal":
                                case "numeric":
                                case "numrange":
                                    $cls->{$fields[$i]} = $valor;
                                    break;
                                case "date":
                                case "daterange":
                                case "time":
                                case "time without time zone":
                                case "timestamp":
                                case "timestamp without time zone":
                                case "timestamp with time zone":
                                case "time with time zone":
                                case "timestamp":
                                    try {
                                        $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal.
                                        if ($date == null || $date == '')//Entonces no es Date y por lo tanto puede ser String o Bytea
                                            $cls->{$fields[$i]} = $valor;
                                        else
                                            $cls->{$fields[$i]} = Date::fromString($valor);
                                    }catch (Exception $e){
                                        $cls->{$fields[$i]} = $valor;
                                    }
                                    break;
                                case "bytea":
                                    try {
                                        $vblob=pg_unescape_bytea($valor);
                                        $objeto2 = new php__BytesData_Wrapper($vblob);
                                        $objeto = new haxe_io_Bytes(strlen($vblob), $objeto2);
                                        $cls->{$fields[$i]} = $objeto;
                                    }catch (Exception $e){
                                        $cls->{$fields[$i]} = $valor;
                                    }
                                    break;
                                default:
                                    $cls->{$fields[$i]} = $valor;
                                    break;
                            }
                        }
                    }
                    break;

                }
                $con->desconectarBD();
                pg_free_result($stmt);
                return $cls;
                break;
            case "ObjectArray":
                $stmt = pg_execute($sqlName, $parmetersCast);
                $laClase=self::ClassDecoder($class);
                $fields=self::Fields($laClase);
                $c=count($fields);
                $resultArray=Array();
                $count=0;
                //numero de filas devueltas en consulta
                $pgn = pg_num_fields($stmt);
                while ($R = pg_fetch_array($stmt,null, PGSQL_BOTH))
                {
                    $cls=self::ClassDecoder($class);
                    for($i=0;$i<$c;++$i) {

                        $dataType="";
                        //recorro el numero de filas devueltas
                        for($j=0;$j<$pgn;++$j) {
                            if(pg_field_name($stmt, $j)==$fields[$i]){
                                $dataType= pg_field_type($stmt, $j);
                                break;
                            }
                        }
                        $valor = $R[$fields[$i]];
                       if (!is_null($valor)) {//si el valor devuelto no es null
                           switch ($dataType) {
                                case "character":
                                case "char":
                                case "text":
                                case "uuid":
                                case "character varying":
                                case "varchar":
                                case "xml":
                                    $cls->{$fields[$i]} = utf8_encode($valor);
                                    break;
                                case "real":
                                case "double precision":
                                case "inet":
                                case "smallint":
                                case "smallserial":
                                case "integer":
                                case "serial":
                                case "int4range":
                                case "bigint":
                                case "bigserial":
                                case "int8range":
                                case "decimal":
                                case "numeric":
                                case "numrange":
                                    $cls->{$fields[$i]} = $valor;
                                    break;
                                case "date":
                                case "daterange":
                                case "time":
                                case "time without time zone":
                                case "timestamp":
                                case "timestamp without time zone":
                                case "timestamp with time zone":
                                case "time with time zone":
                                case "timestamp":
                                    try {
                                        $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal.
                                        if ($date == null || $date == '')//Entonces no es Date y por lo tanto puede ser String o Bytea
                                            $cls->{$fields[$i]} = $valor;
                                        else
                                            $cls->{$fields[$i]} = Date::fromString($valor);
                                    }catch (Exception $e){
                                        $cls->{$fields[$i]} = $valor;
                                    }
                                    break;
                                case "bytea":
                                    try {
                                        $vblob=pg_unescape_bytea($valor);
                                        $objeto2 = new php__BytesData_Wrapper($vblob);
                                        $objeto = new haxe_io_Bytes(strlen($vblob), $objeto2);
                                        $cls->{$fields[$i]} = $objeto;
                                    }catch (Exception $e){
                                        $cls->{$fields[$i]} = $valor;
                                    }
                                    break;
                                default:
                                    $cls->{$fields[$i]} = $valor;
                                    break;
                            }
                        }
                    }
                    $resultArray[$count]=$cls;
                    $count++;
                }
                pg_free_result($stmt);
                $con->desconectarBD();
                return new _hx_array($resultArray);
                break;
        }
    }

    static function postgresQueryCast($sql){
        $tableName=self::postgresTableName($sql);
        //1) reemplazamos el nombre de la tabla en todas las coincidencias agregando "tableName"
        //2) reemplazamos todos los saltos de linea de la sentencia
        //3) reemplazamos Todos . por ."
        //4) reemplazamos todos , por ","
        //5) reemplazamos todos = por "=
        $sqlTraslate=str_replace($tableName, "\"$tableName\"", $sql);
        $sqlTraslate=str_replace("\n","",$sqlTraslate);
        $sqlTraslate=str_replace(".",".\"",$sqlTraslate);
        $sqlTraslate=str_replace(" =","\" =",$sqlTraslate);
        if( strpos( $sqlTraslate, "ELECT") == true ) {
            if( strpos( $sqlTraslate, "*") == false )
                $sqlTraslate = str_replace(" FROM", "\" FROM", $sqlTraslate);
        }
        if( strpos( $sqlTraslate, "FROM") == true ) {
            $sqlTraslate = str_replace(", ", "\", \"", $sqlTraslate);
        }
        if( strpos( $sqlTraslate, "NSERT") == true ) {
            $elementArray=explode("VALUES",$sqlTraslate);
            $firstElement=str_replace(", ","\", \"",$elementArray[0]);
            $firstElement=str_replace("(","(\"",$firstElement);
            $firstElement=str_replace(")","\")",$firstElement);
            $sqlTraslate=$firstElement."VALUES".$elementArray[1];
        }
        if( strpos( $sqlTraslate, "PDATE") == true ) {
            $sqlTraslate=str_replace(", ",", \"",$sqlTraslate);
            $sqlTraslate=str_replace("SET ","SET \"",$sqlTraslate);
            $sqlTraslate=str_replace("WHERE"," WHERE",$sqlTraslate);
        }

        if( strpos( $sqlTraslate, "ELETE") == true ) {
            $elementArray=explode("FROM",$sqlTraslate);
            $firstElement=str_replace("\"".$tableName."\"","",$elementArray[0]);
            $sqlTraslate=$firstElement." FROM".$elementArray[1];
        }

        return $sqlTraslate;
    }

    static function postgresTableName($Query){

        if( strpos( $Query, "FROM") == true ) {
            //1)Buscamos donde empieza el From
            //2)Buscamos donde empieza el Where
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            $FromSentences=strstr($Query, 'FROM');
            if( strpos( $FromSentences, "WHERE") == true )
                $WhereSentences=strstr($FromSentences, 'WHERE',true);
            else
                $WhereSentences=$FromSentences;
            $onlyWorld=str_replace("FROM", "", $WhereSentences);
            $onlyWorld=str_replace("WHERE", "", $onlyWorld);
            $onlyWorld=trim($onlyWorld);
            return $onlyWorld;
        }

        if( strpos( $Query, "INTO") == true ) {
            //1)Buscamos donde empieza el INTO
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            $InsertSentences=strstr($Query, 'INTO');
            $InitSentences=strstr($InsertSentences, '(',true);
            $onlyWorld=str_replace("INTO", "", $InitSentences);
            $onlyWorld=str_replace("(", "", $onlyWorld);
            $onlyWorld=trim($onlyWorld);
            return $onlyWorld;
        }

        if( strpos( $Query, "PDATE") == true ) {
            //1)Buscamos donde empieza el UPDATE
            //2)Buscamos donde empieza el (
            //3)Quitamos los espacion
            //4)Obtenemos la cadena
            $UpdateSentences=strstr($Query, 'UPDATE');
            $InitSentences=strstr($UpdateSentences, 'SET',true);
            $onlyWorld=str_replace("UPDATE", "", $InitSentences);
            $onlyWorld=str_replace("SET", "", $onlyWorld);
            $onlyWorld=trim($onlyWorld);
            return $onlyWorld;
        }

    }


    static function processSQLSERVER($url_Coneccion,$serverPOrt,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicinalConf){
        $con = new ConectarSQL($url_Coneccion,$serverPOrt,$user,$password,$dbName);//Instancio la clase y creo la coneccion
        //Proceso de decodificacion de Sentencia SQL ya que sqlsrv acepta como parametros la sentencia ? mientras que ORM
        //Los devuelve como @, se hace un proceso de castin de parametros
        $sqlCast=$sql;
        $parametersNum=$parameters->length;
        for ($i = 1; $i <= $parametersNum; $i++) {
            $sqlCast=str_replace("@P$i","?",$sqlCast);
        }
        $conn=$con->TomarConeccion();
        try {
            $sqlCast = self::cast_QuerySQLSQever($sqlCast, $parameters);
        } catch (Exception $e) {
            print_r('Excepción capturada: ',  $e->getMessage(), "\n");
        }

        $parmetersCast=self::cast_parametersSQLServer($parameters);
        if (!$stmt = sqlsrv_prepare($conn, $sqlCast, $parmetersCast)) {
            die( print_r( sqlsrv_errors(), true));
            return false;
        }else {
            switch ($operation) {
                case "NonQuery":
                    if( !sqlsrv_execute( $stmt))
                        die( print_r( sqlsrv_errors(), true));
                    $con->desconectarBD();
                    return null;
                    break;
                case "Scalar":
                    if( !$res=sqlsrv_execute( $stmt))
                        die( print_r( sqlsrv_errors(), true));
                    $id=self::sql_insert_id($conn);
                    $con->desconectarBD();
                    return $id;
                    break;
                case "Datatable":
                    if( !$res=sqlsrv_execute( $stmt))
                        die( print_r( sqlsrv_errors(), true));
                    else {
                        $resp = self::ConvertToHaxeDataTableSQLSV($stmt);
                        $con->desconectarBD();
                        return $resp;
                    }
                    break;
                case "SingleObject":
                    if( !$res=sqlsrv_execute( $stmt))
                        die( print_r( sqlsrv_errors(), true));
                    else {
                        $laClase=self::ClassDecoder($class);
                        $fields=self::Fields($laClase);
                        $c=count($fields);
                        $metaData = sqlsrv_field_metadata($stmt);
                        while ($R = sqlsrv_fetch_array($stmt, SQLSRV_FETCH_BOTH))
                        {
                            $laClase=self::ClassDecoder($class);
                            for($i=0;$i<$c;++$i){
                                $type=0;
                                //recorro las filas y verifico si el nombre de la columna de consulta es la misma que la clase
                                foreach( $metaData as $fieldMetadata)
                                {
                                    if($fieldMetadata[Name]==$fields[$i]){
                                        $type=$fieldMetadata[Type];
                                        break;
                                    }
                                }
                                $valor=$R[$fields[$i]];
                                if (!is_null($valor)) {
                                    switch ($type) {
                                        /**Numericos**/
                                        case -5://bigint
                                        case 3://decimal-money-Smallmoney
                                        case 6://float
                                        case 4://int
                                        case 2://numeric
                                        case 7://real
                                        case 5://smallint
                                        case -6://tinyint
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                        /**Binarios**/
                                        case -5://binary
                                        case -7://bit
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                        /**Textos**/
                                        case -1://text
                                        case 1://char
                                        case -8://nchar
                                        case -10://ntext
                                        case -9://nvarchar
                                        case 12://varchar
                                        case -152://xml
                                            $laClase->{$fields[$i]} = utf8_encode($valor);//ES UN VARCHAR
                                            break;
                                        /**Fechas**/
                                        case 91://date
                                        case 93://datetime
                                        case -155://datetimeoffset
                                        case 93://smalldatetime
                                        case -154://time
                                        case -2://timestamp
                                            try {
                                                $laClase->{$fields[$i]} = Date::fromString($R[$fields[$i]]->format('Y-m-d H:i:s'));
                                            } catch (Exception $e) {
                                                $laClase->{$fields[$i]} = $valor;
                                            }
                                            break;
                                        /**Tipo binarios**/
                                        case -4://imagen
                                        case -3://varbinary
                                            $objeto2 = new php__BytesData_Wrapper($valor);
                                            $objeto = new haxe_io_Bytes(strlen($valor), $objeto2);
                                            $laClase->{$fields[$i]} = $objeto;
                                            break;
                                        default:
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                    }
                                }
                            }
                            sqlsrv_free_stmt($stmt);
                            $con->desconectarBD();
                            return $laClase;
                        }
                    }
                    break;
                case "ObjectArray":
                    $resultArray=Array();
                    if( !$res=sqlsrv_execute( $stmt))
                        die( print_r( sqlsrv_errors(), true));
                    else {
                        $laClase=self::ClassDecoder($class);
                        $fields=self::Fields($laClase);
                        $c=count($fields);
                        $metaData = sqlsrv_field_metadata($stmt);
                        while ($R = sqlsrv_fetch_array($stmt, SQLSRV_FETCH_BOTH))
                        {
                            $laClase=self::ClassDecoder($class);
                            for($i=0;$i<$c;++$i){
                                $type=0;
                                //recorro las filas y verifico si el nombre de la columna de consulta es la misma que la clase
                                foreach( $metaData as $fieldMetadata)
                                {
                                    if($fieldMetadata[Name]==$fields[$i]){
                                        $type=$fieldMetadata[Type];
                                        break;
                                    }
                                }
                                $valor=$R[$fields[$i]];
                                if (!is_null($valor)) {
                                    switch ($type) {
                                        /**Numericos**/
                                        case -5://bigint
                                        case 3://decimal-money-Smallmoney
                                        case 6://float
                                        case 4://int
                                        case 2://numeric
                                        case 7://real
                                        case 5://smallint
                                        case -6://tinyint
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                        /**Binarios**/
                                        case -5://binary
                                        case -7://bit
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                        /**Textos**/
                                        case -1://text
                                        case 1://char
                                        case -8://nchar
                                        case -10://ntext
                                        case -9://nvarchar
                                        case 12://varchar
                                        case -152://xml
                                            $laClase->{$fields[$i]} = utf8_encode($valor);//ES UN VARCHAR
                                            break;
                                        /**Fechas**/
                                        case 91://date
                                        case 93://datetime
                                        case -155://datetimeoffset
                                        case 93://smalldatetime
                                        case -154://time
                                        case -2://timestamp
                                            try {
                                                $laClase->{$fields[$i]} = Date::fromString($R[$fields[$i]]->format('Y-m-d H:i:s'));
                                            } catch (Exception $e) {
                                                $laClase->{$fields[$i]} = $valor;
                                            }
                                            break;
                                        /**Tipo binarios**/
                                        case -4://imagen
                                        case -3://varbinary
                                            $objeto2 = new php__BytesData_Wrapper($valor);
                                            $objeto = new haxe_io_Bytes(strlen($valor), $objeto2);
                                            $laClase->{$fields[$i]} = $objeto;
                                            break;
                                        default:
                                            $laClase->{$fields[$i]} = $valor;
                                            break;
                                    }
                                }
                            }
                            array_push($resultArray, $laClase);
                        }
                        sqlsrv_free_stmt($stmt);
                        $con->desconectarBD();
                        return new _hx_array($resultArray);
                    }
                    break;
            }
        }
    }



    static function processORACLE($url_Coneccion,$port,$user,$password,$dbName,$sql,$parameters,$operation,$class,$adicinalConf){
        self::$lobOra=false;//variable identificador si es archivo
        $con = new ConectarOracle($url_Coneccion,$port,$user,$password,$dbName);//Instancio la clase y creo la coneccion
        $conn=$con->TomarConeccion();
        /**PROCESO ESPECIFICO PARA EL MANEJO DE FECHAS**/
        // Establecer el formato de fecha para esta conexión.
        // Por razones de rendimiento, considere cambiar el formato
        // en un disparador o con variables de entorno en su lugar
        // Ref:http://sqlfiddle.com/#!4/e4aed/5
        $stid = oci_parse($conn, "ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD hh24:mi:ss'");
        oci_execute($stid);
        $stid = oci_parse($conn, "ALTER SESSION SET NLS_TIMESTAMP_FORMAT = 'yyyy-mm-dd\"T\"hh24:mi:ss.ff3\"Z\"'");
        oci_execute($stid);

        //para el proceso de tomar id en oracle
        switch ($operation) {
            case "Scalar":
                $pos = strpos($sql, "returning");
                if(!$pos){
                    $pos = strpos($sql, ";");
                    if(!$pos){
                        $sql=$sql." returning ID INTO :RV";
                    }else{
                        $sql=str_replace( ";", " returning ID INTO :RV", $sql);
                    }
                }
                break;
        }
        //cast de query ORM a query ORACLE
        //self::$sqlEncripter=self::postgresQueryCast($sql);
        self::$sqlEncripter=$sql;
        $parametersNum=$parameters->length;
        for ($i = 1; $i <= $parametersNum; $i++) {
            self::$sqlEncripter=str_replace("@P$i",":P$i",self::$sqlEncripter);
        }
        //cast query en caso de traer archivos binarios
        self::cast_ORA_Binary_Query($parameters);
        $resultado = oci_parse($conn, self::$sqlEncripter);//se envia la coneccion y la preparacion del query
        if (!$resultado){
            printf("<br> Error: %s ",$conn->error);
        }
        //Cast de pararmetros
        self::cast_parametersORA($parameters,$conn,$resultado);
        //verificacion de proceso a realizar
        switch ($operation) {
            case "NonQuery":
                try {
                    if (self::$lobOra) {// si tiene archivos binarios
                        if(!oci_execute($resultado, OCI_DEFAULT)){//executo cy preparo envio posterior
                            $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                            trigger_error(htmlentities($e['message']), E_USER_ERROR);
                        }
                        //recorro los parametros blob y se los envio con su preparacion respectiva
                        for($i=0;$i<self::$countBlob;$i++){
                            if (self::$lob[$i]->save(self::$lobOraValue[$i],null)){
                                oci_commit($conn);
                            }
                        }
                    }else{
                        if(!oci_execute($resultado)){
                            $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                            trigger_error(htmlentities($e['message']), E_USER_ERROR);
                        }
                        else
                            oci_commit($conn);
                    }
                } catch (Exception $e) {
                    echo 'Excepción capturada: ',  $e->getMessage(), "\n";
                }
                $con->desconectarBD();
                return null;
                break;
            case "Scalar":
                oci_bind_by_name($resultado, ":RV", $rv, -1, SQLT_INT);
                if(!oci_execute($resultado)){
                    $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                    trigger_error(htmlentities($e['message']), E_USER_ERROR);
                }else
                    oci_commit($conn);
                $con->desconectarBD();
                return $rv;
                break;

            case "Datatable":
                if(!oci_execute($resultado)){
                    $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                    trigger_error(htmlentities($e['message']), E_USER_ERROR);
                }
                $resp=self::ConvertToHaxeDataTableORACLE($resultado);
                $con->desconectarBD();
                return $resp;
                break;
            case "SingleObject":
                if(!oci_execute($resultado)){
                    $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                    trigger_error(htmlentities($e['message']), E_USER_ERROR);
                }
                $laClase=self::ClassDecoder($class);
                $fields=self::Fields($laClase);
                $c=count($fields);
                while (($R = oci_fetch_array($resultado, OCI_RETURN_NULLS)) != false)
                {
                    $cls =self::ClassDecoder($class);
                    for ($i = 0; $i < $c; ++$i) {
                        $valor = $R[$fields[$i]];
                        try{
                            $column_type  = oci_field_type($resultado, $fields[$i]);
                            if (!is_null($valor)) {
                                switch ($column_type) {
                                    /**Numericos**/
                                    case "CHARACTER":
                                    case "CHAR":
                                    case "NCHAR":
                                    case "VARCHAR":
                                    case "VARCHAR2":
                                    case "NVARCHAR2":
                                        $cls->{$fields[$i]} = utf8_encode($valor);
                                        break;
                                    case "NUMERIC":
                                    case "DECIMAL":
                                    case "DEC":
                                    case "INTEGER":
                                    case "INT":
                                    case "SMALLINT":
                                    case "FLOAT":
                                    case "DOUBLE":
                                    case "REAL":
                                    case "BYNARY_FLOAT":
                                    case "BYNARY_DOUBLE":
                                        $cls->{$fields[$i]} = $valor;
                                        break;
                                    case "DATE":
                                    case "TIMESTAMP":
                                    case "INTERVAL":
                                        try {
                                            $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal, sino la encripto como Date
                                            if ($date == null || $date == '')
                                                $cls->{$fields[$i]} = utf8_encode($valor);
                                            else
                                                $cls->{$fields[$i]} = Date::fromString($valor);
                                        } catch (Exception $e) {
                                            $cls->{$fields[$i]} = $valor;
                                        }
                                        break;
                                    case "BLOB":
                                    case "CLOB":
                                    case "NCLOB":
                                    case "BFILE":
                                        $foo = $valor->read($valor->size());
                                        $objeto2 = new php__BytesData_Wrapper($foo);
                                        $objeto = new haxe_io_Bytes($valor->size(), $objeto2);
                                        $cls->{$fields[$i]} = $objeto;
                                        break;
                                    default:
                                        $cls->{$fields[$i]} = $valor;
                                        break;
                                }
                            }
                        } catch (Exception $e) {
                            //Error en caso de no ser un objeto con la estructura esperada
                        }
                    }
                    $con->desconectarBD();
                    oci_free_statement($resultado);
                    return $cls;
                }
                break;
            case "ObjectArray":
                if(!oci_execute($resultado)){
                    $e = oci_error($resultado);  // Para errores de oci_parse, pase el gestor de conexión
                    trigger_error(htmlentities($e['message']), E_USER_ERROR);
                }
                $laClase=self::ClassDecoder($class);
                $resultArray=Array();
                $fields=self::Fields($laClase);

                $count=0;
                while (($R = oci_fetch_array($resultado, OCI_RETURN_NULLS)) != false)
                {
                    $c=count($fields);
                    $cls =self::ClassDecoder($class);
                    for ($i = 0; $i < $c; ++$i) {
                        $valor = $R[$fields[$i]];
                        try{
                            $column_type  = oci_field_type($resultado, $fields[$i]);
                            if (!is_null($valor)) {
                                switch ($column_type) {
                                    /**Numericos**/
                                    case "CHARACTER":
                                    case "CHAR":
                                    case "NCHAR":
                                    case "VARCHAR":
                                    case "VARCHAR2":
                                    case "NVARCHAR2":
                                        $cls->{$fields[$i]} = utf8_encode($valor);
                                        break;
                                    case "NUMERIC":
                                    case "DECIMAL":
                                    case "DEC":
                                    case "INTEGER":
                                    case "INT":
                                    case "SMALLINT":
                                    case "FLOAT":
                                    case "DOUBLE":
                                    case "REAL":
                                    case "BYNARY_FLOAT":
                                    case "BYNARY_DOUBLE":
                                        $cls->{$fields[$i]} = $valor;
                                        break;
                                    case "DATE":
                                    case "TIMESTAMP":
                                    case "INTERVAL":
                                        try {
                                            $date = strtotime($valor);//verifico si puedo transformar en date si no es posible le encripto normal, sino la encripto como Date
                                            if ($date == null || $date == '')
                                                $cls->{$fields[$i]} = utf8_encode($valor);
                                            else
                                                $cls->{$fields[$i]} = Date::fromString($valor);
                                        } catch (Exception $e) {
                                            $cls->{$fields[$i]} = $valor;
                                        }
                                       break;
                                    case "BLOB":
                                    case "CLOB":
                                    case "NCLOB":
                                    case "BFILE":
                                        try {
                                            $foo = $valor->read($valor->size());
                                            $objeto2 = new php__BytesData_Wrapper($foo);
                                            $objeto = new haxe_io_Bytes($valor->size(), $objeto2);
                                            $cls->{$fields[$i]} = $objeto;
                                        } catch (Exception $e) {
                                            $cls->{$fields[$i]} = $valor;
                                        }
                                        break;
                                    default:
                                        $cls->{$fields[$i]} = $valor;
                                        break;
                                }
                            }
                        } catch (Exception $e) {
                            //Error en caso de no ser un objeto con la estructura esperada
                    }
                    }
                    $resultArray[$count]=$cls;
                    $count++;
                }
                $con->desconectarBD();
                oci_free_statement($resultado);
                return new _hx_array($resultArray);
                break;
        }
    }
    static  function sql_insert_id($conn) {
        $id = 0;
        $res = sqlsrv_query($conn,"SELECT @@identity AS id");
        if ($row = sqlsrv_fetch_array($res, SQLSRV_FETCH_ASSOC)) {
            $id = $row["id"];
        }
        return $id;
    }
    static function ClassDecoder($class){
        $tableName=$class.__tname__;
        $tableName=str_replace("__tname__","",$tableName);
        $tableName=str_replace(".","_",$tableName);
        return new $tableName();
    }

    static function Fields($class){
        $result= array();
        $class_vars = get_class_vars(get_class($class));
        $i=0;
        foreach ($class_vars as $name => $value) {
            if (substr( $name, 0, 2 ) === "__") continue;
            $result[$i]=$name;
            $i=$i+1;
        }
        return $result;
    }

    static function ConvertToHaxeDataTable($result){
        $dataTable=new cornerstone_orm_client_DataTable();
        $f=$result->num_rows;
        $c=mysqli_num_fields($result);
        $i = 0;
        while ($i < mysqli_num_fields($result)){
            $field = mysqli_fetch_field_direct($result, $i);
            $fieldName=$field->name;
            $fieldType=$field->type;
            $dataColumn = new cornerstone_orm_client_DataColumn();
            $dataColumn->set_ColumnIndex($i);
            $dataColumn->set_ColumnName($fieldName);
            $dataColumn->set_ColumnType(self::convertToHaxeType($fieldType));
            $dataTable->Columns->push($dataColumn);
            $i = $i + 1;
        }
        while ($R = $result->fetch_array(MYSQLI_NUM))
        {
            $dataRow=new cornerstone_orm_client_DataRow();
            $a_params = array();
            for($j=0;$j<$c;++$j) {
                //$a_params[$j] = $R[$j];
                if (is_string($R[$j]))
                    $a_params[$j] = utf8_encode($R[$j]);
                else
                    $a_params[$j] = $R[$j];
            }
            $dataRow->set_Items($a_params);
            $dataTable->Rows->push($dataRow);
        }
        return $dataTable;
    }

    static function ConvertToHaxeDataTableSQLSV ($result){

        $dataTable=new cornerstone_orm_client_DataTable();
        $f=sqlsrv_num_rows($result);
        $c=sqlsrv_num_fields( $result );
        $contador=0;
        while ($R = sqlsrv_fetch_array($result, SQLSRV_FETCH_NUMERIC))
        {
            $dataRow=new cornerstone_orm_client_DataRow();
            $a_params = array();
            for($j=0;$j<$c;++$j) {
                //$a_params[$j] = $R[$j];
                if (is_string($R[$j]))
                    $a_params[$j] = utf8_encode($R[$j]);
                else
                    $a_params[$j] = $R[$j];
            }
            $dataRow->set_Items($a_params);
            $dataTable->Rows->push($dataRow);
        }

        $metaData =sqlsrv_field_metadata($result); // $result instead of $stmt in your case
        $contador=count($metaData);

        for ($i = 0; $i < $contador; $i++) {
            $name= $metaData[$i]["Name"];
            $type = $metaData[$i]["Type"];

            $dataColumn = new cornerstone_orm_client_DataColumn();
            $dataColumn->set_ColumnIndex($i);
            $dataColumn->set_ColumnName($name);
            $dataColumn->set_ColumnType(self::convertToHaxeTypeSQLSV($type));

            $dataTable->Columns->push($dataColumn);
        }
        return $dataTable;
    }

    static function ConvertToHaxeDataTablePG($result){
        $dataTable=new cornerstone_orm_client_DataTable();
        $f=pg_num_rows($result);
        $c=pg_num_fields( $result );
        $i = 0;
        while ($i < $c){
            $fieldname = pg_field_name($result, $i);
            $fuelType=pg_field_type($result, $i);
            $dataColumn = new cornerstone_orm_client_DataColumn();
            $dataColumn->set_ColumnIndex($i);
            $dataColumn->set_ColumnName($fieldname);
            $dataColumn->set_ColumnType(self::convertToHaxeTypePG($fuelType));
            $dataTable->Columns->push($dataColumn);
            $i = $i + 1;
        }
        while ($R = pg_fetch_array($result,null, PGSQL_NUM))
        {
            $dataRow=new cornerstone_orm_client_DataRow();
            $a_params = array();
            for($j=0;$j<$c;++$j) {
                //$a_params[$j] = $R[$j];
                if (is_string($R[$j]))
                    $a_params[$j] = utf8_encode($R[$j]);
                else
                    $a_params[$j] = $R[$j];
            }
            $dataRow->set_Items($a_params);
            $dataTable->Rows->push($dataRow);
        }
        return $dataTable;
    }

    static function ConvertToHaxeDataTableORACLE($result){
        $dataTable=new cornerstone_orm_client_DataTable();
        $f = oci_num_rows($result);
        $c = oci_num_fields($result);
        $i = 0;

        for ($i = 1; $i <= $c; $i++) {
            $column_name  = oci_field_name($result, $i);
            $column_type  = oci_field_type($result, $i);
            $dataColumn = new cornerstone_orm_client_DataColumn();
            $dataColumn->set_ColumnIndex($i);
            $dataColumn->set_ColumnName($column_name);
            $dataColumn->set_ColumnType(self::convertToHaxeTypeORACLE($column_type));
            $dataTable->Columns->push($dataColumn);
        }
        while (($R = oci_fetch_array($result, OCI_RETURN_NULLS)) != false)
        {
            $dataRow=new cornerstone_orm_client_DataRow();
            $a_params = array();
            for($j=0;$j<$c;++$j) {
                //$a_params[] = $R[$j];
                if (is_string($R[$j]))
                    $a_params[$j] = utf8_encode($R[$j]);
                else
                    $a_params[$j] = $R[$j];
            }
            $dataRow->set_Items($a_params);
            $dataTable->Rows->push($dataRow);
        }
        return $dataTable;
    }

    static function convertToHaxeTypeORACLE($type){

        if($type=="NUMBER") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="FLOAT") return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type=="DECIMAL") return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type=="INT") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="DOUBLE") return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type=="VARCHAR2") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="CLOB") return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type=="BLOB") return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type=="DATE") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="TIMESTAMP") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;

        return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
    }

    static function convertToHaxeTypePG($type){
        if($type=="bit") return cornerstone_orm_common_enums_DBTypeEnum::$BOOLEAN;
        if($type=="bool") return cornerstone_orm_common_enums_DBTypeEnum::$BOOLEAN;
        if($type=="box") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="bpchar") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="bytea") return cornerstone_orm_common_enums_DBTypeEnum::$NVARCHAR;
        if($type=="cidr") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="circle") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="date") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="daterange") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="float4") return cornerstone_orm_common_enums_DBTypeEnum::$FLOAT;
        if($type=="float8") return cornerstone_orm_common_enums_DBTypeEnum::$FLOAT;
        if($type=="inet") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="int2") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="int4") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="int4range") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="int8") return cornerstone_orm_common_enums_DBTypeEnum::$BIGINTEGER;
        if($type=="int8range") return cornerstone_orm_common_enums_DBTypeEnum::$BIGINTEGER;
        if($type=="interval") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="json") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="lseg") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="macaddr") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="money") return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type=="numeric") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="numrange") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="path") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="point") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="polygon") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="text") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="time") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="timestamp") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="timestamptz") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="timetz") return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type=="tsquery") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="tsrange") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="tsvector") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="uuid") return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type=="varbit") return cornerstone_orm_common_enums_DBTypeEnum::$CHAR;
        if($type=="varchar") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type=="xml") return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
    }


    static function convertToHaxeTypeSQLSV($type){
        if($type==(-5)) return cornerstone_orm_common_enums_DBTypeEnum::$BIGINTEGER;
        if($type==(-2)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(-7)) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==(1)) return cornerstone_orm_common_enums_DBTypeEnum::$CHAR;
        if($type==(91)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(93)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(-155)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(3)) return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type==(6)) return cornerstone_orm_common_enums_DBTypeEnum::$FLOAT;
        if($type==(-4)) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==(4)) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==(3)) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==(-8)) return cornerstone_orm_common_enums_DBTypeEnum::$NVARCHAR;
        if($type==(-10)) return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type==(2)) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==(-9)) return cornerstone_orm_common_enums_DBTypeEnum::$NVARCHAR;
        if($type==(7)) return cornerstone_orm_common_enums_DBTypeEnum::$REAL;
        if($type==(5)) return cornerstone_orm_common_enums_DBTypeEnum::$SMALLINTEGER;
        if($type==(3)) return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type==(-1)) return cornerstone_orm_common_enums_DBTypeEnum::$CHAR;
        if($type==(-154)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(-2)) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==(-6)) return cornerstone_orm_common_enums_DBTypeEnum::$SMALLINTEGER;
        if($type==(-151)) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==(-11)) return cornerstone_orm_common_enums_DBTypeEnum::$UUID;
        if($type==(-3)) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==(-12)) return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type==(-152)) return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
    }

    static function convertToHaxeType($type){
        if($type==0) return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type==1) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==2) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==3) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==4) return cornerstone_orm_common_enums_DBTypeEnum::$FLOAT;
        if($type==5) return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        if($type==7) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==8) return cornerstone_orm_common_enums_DBTypeEnum::$BIGINTEGER;
        if($type==9) return cornerstone_orm_common_enums_DBTypeEnum::$INTEGER;
        if($type==10) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==11) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==12) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==13) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==14) return cornerstone_orm_common_enums_DBTypeEnum::$DATETIME;
        if($type==16) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==249) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==250) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==251) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==252) return cornerstone_orm_common_enums_DBTypeEnum::$BINARY;
        if($type==253) return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
        if($type==254) return cornerstone_orm_common_enums_DBTypeEnum::$CHAR;
        if($type==246) return cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL;
        return cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR;
    }

    static function cast_parameters($listParameters){
        self::$blobArray = array();
        self::$blobArrayIndex = array();
        $param=new cornerstone_orm_client_Parameter();
        $n = $listParameters->length;
        $param_type = '';
        for($i = 0; $i < $n; $i++) {
            $param= $listParameters[$i];
            $param_type .=self::cast_parameter_type($param->get_DataType());
        }
        $a_params[] = & $param_type;
        for($i = 0; $i < $n; $i++) {
            $param= $listParameters[$i];
            $parameTypeHaxe=$param->get_DataType();
            if($parameTypeHaxe=="VARCHAR"||$parameTypeHaxe=="BIGTEXT"||$parameTypeHaxe=="CHAR"
                ||$parameTypeHaxe=="NCHAR"||$parameTypeHaxe=="NBIGTEXT"||$parameTypeHaxe=="NCHAR"
                ||$parameTypeHaxe=="NVARCHAR"||$parameTypeHaxe=="VARCHAR")
                $a_params[] =utf8_encode($param->get_Value());
            else{
                if($parameTypeHaxe=="DATETIME") {
                    $dateHexe = $param->get_Value()->toString();
                    $a_params[] = date_create($dateHexe)->format('Y-m-d H:i:s');
                }
                else {
                    if($parameTypeHaxe=="BINARY") {
                        $objectBlob=$param->get_Value();
                        self::$blobArray[]=$objectBlob->b->s;//se toma el valor y se lo guarda en un array ya que se lo inserara posterioremente "Regalas de mysqli :("
                        self::$blobArrayIndex[]=$i;//guardamos los indices
                        $a_params[] =null;// temporalmente se almacenan con null;
                    }else{
                        $a_params[] = $param->get_Value();
                    }
                }
            }
            //$a_params[] = $param->get_Value();
        }
        return $a_params;

    }

    static function  cast_QuerySQLSQever( $query, $listParameters){

        $n = $listParameters->length;
        $queryParams ="";
        $elementArrayPrimary="";
        $elementArrayLast="";
        $elementArrayDetail="";

        for ($i = 0; $i < $n; $i++) {
            $Objecto=new cornerstone_orm_client_Parameter();
            $Objecto=$listParameters[$i];
            $dateTypeHaxe=$Objecto->DataType;

            if($dateTypeHaxe=="BINARY") {
                if( strpos( $query, "NSERT") == true ) {
                    $elementArray = explode("VALUES", $query);
                    $elementArrayPrimary = $elementArray[0];
                    $paramsElements = $elementArray[1];
                    $paramsElements = str_replace("(", "", $paramsElements);
                    $paramsElements = str_replace(")", "", $paramsElements);
                    $elementArrayDetail = explode(",", $paramsElements);
                    for ($j = 0; $j < $n; $j++) {
                        if ($i == $j) {
                            $queryParams = $queryParams . "CAST (? AS varbinary(max)),";
                        } else {
                            $queryParams = $queryParams . $elementArrayDetail[$j] . ",";
                        }
                    }
                    $queryParams = trim($queryParams);
                    $queryParams = substr($queryParams, 0, (strlen($queryParams) - 1));
                }
                if( strpos( $query, "PDATE") == true ) {
                    $elementPrincipal = explode("SET", $query);
                    $elementArrayPrimary=$elementPrincipal[0];
                    $elementSecundario = explode("WHERE", $elementPrincipal[1]);
                    if( strpos( $$query, "WHERE") == true ) {
                        $elementArrayLast="";
                    }
                    else{
                        $elementArrayLast=$elementSecundario[1];
                    }
                    $elemntParameters= explode(",", $elementSecundario[0]);
                    $count=count($elemntParameters);
                    for ($j = 0; $j < $count; $j++) {
                        if ($i == $j) {
                            $castParameter=str_replace("?","CAST (? AS varbinary(max)),",$elemntParameters[$j]);
                            $queryParams = $queryParams . "".$castParameter;
                        } else {
                            $queryParams = $queryParams . $elemntParameters[$j] . ",";
                        }
                    }
                    $queryParams = trim($queryParams);
                    $queryParams = substr($queryParams, 0, (strlen($queryParams) - 1));

                }
            }


        }
        if(!$queryParams==""){
            if( strpos( $query, "NSERT") == true ) {
                $query=$elementArrayPrimary." VALUES (".$queryParams.")";
            }
            if( strpos( $query, "PDATE") == true ) {
                $query=$elementArrayPrimary." SET ".$queryParams." WHERE ".$elementArrayLast;
            }
            return $query;
        }else{
            return $query;
        }
    }

    static function cast_parametersPG($listParameters){
        $n = $listParameters->length;
        $a_params = array();
        for ($i = 0; $i < $n; $i++) {
            $Objecto=new cornerstone_orm_client_Parameter();
            $Objecto=$listParameters[$i];
            $dateTypeHaxe=$Objecto->DataType;
            if($dateTypeHaxe=="VARCHAR"||$dateTypeHaxe=="BIGTEXT"||$dateTypeHaxe=="CHAR"
                ||$dateTypeHaxe=="NCHAR"||$dateTypeHaxe=="NBIGTEXT"||$dateTypeHaxe=="NCHAR"
                ||$dateTypeHaxe=="NVARCHAR"||$dateTypeHaxe=="VARCHAR")
                $a_params[] =utf8_encode($Objecto->Value);
            else{
                if($dateTypeHaxe=="DATETIME") {
                    $dateHexe = $Objecto->Value->toString();
                    $a_params[] = date_create($dateHexe)->format('Y-m-d H:i:s');
                }
                else {
                    if($dateTypeHaxe=="BINARY") {
                        $a_params[]=pg_escape_bytea($Objecto->Value->b->s);

                    }else {
                        $a_params[] = $Objecto->Value;
                    }
                }
            }
        }
        return $a_params;
    }

    static function cast_parametersSQLServer($listParameters){
        $n = $listParameters->length;
        $a_params = array();
        for ($i = 0; $i < $n; $i++) {
            $Objecto=new cornerstone_orm_client_Parameter();
            $Objecto=$listParameters[$i];
            $dateTypeHaxe=$Objecto->DataType;
            if($dateTypeHaxe=="VARCHAR"||$dateTypeHaxe=="BIGTEXT"||$dateTypeHaxe=="CHAR"
                ||$dateTypeHaxe=="NCHAR"||$dateTypeHaxe=="NBIGTEXT"||$dateTypeHaxe=="NCHAR"
                ||$dateTypeHaxe=="NVARCHAR"||$dateTypeHaxe=="VARCHAR")
                $a_params[] =utf8_encode($Objecto->Value);
            else{
                if($dateTypeHaxe=="DATETIME") {
                    $dateHexe = $Objecto->Value->toString();
                    $a_params[] = date_create($dateHexe)->format('Y-m-d H:i:s');
                }
                else {
                    if($dateTypeHaxe=="BINARY") {
                        $a_params[]=$Objecto->Value->b->s;
                    }else {
                        $a_params[] = $Objecto->Value;
                    }
                }
            }
        }
        return $a_params;
    }

    static function cast_ORA_Binary_Query($listParameters){
        $aParameter="";
        $param=new cornerstone_orm_client_Parameter();
        $queryReturn="";
        $isBinary=false;
        $isProcess=false;
        $n = $listParameters->length;
        for($i = 0; $i < $n; $i++) {
            $param= $listParameters[$i];
            $parameTypeHaxe=$param->get_DataType();
            if($parameTypeHaxe=="BINARY") {
                $isBinary=true;
                $isProcess=true;
                //verifico si es un SELECT,INSERT,UPDATE,DELETE
                if(strpos(self::$sqlEncripter, "NSERT") == true){
                    $elementArray=explode("VALUES",self::$sqlEncripter);
                    $inicia=strpos($elementArray[0], "(");
                    $fin=strpos($elementArray[0], ")");
                    $rest = substr($elementArray[0], $inicia, $fin);
                    $rest=str_replace("(","",$rest);
                    $rest=str_replace(")","",$rest);
                    $elementParameters=explode(",",$rest);
                    $aParameter=$elementParameters[$i];
                }

                if(strpos(self::$sqlEncripter, "PDATE") == true) {
                    $isProcess=true;
                    $elementArray = explode("WHERE", self::$sqlEncripter);
                    $inicia = strpos($elementArray[0], "SET");
                    $rest = substr($elementArray[0], $inicia);
                    $rest = str_replace("SET", "", $rest);
                    $rest = str_replace("WHERE", "", $rest);
                    for($j=0;$j<$n;$j++){
                        $rest=str_replace("= :P".$j, "", $rest);
                    }
                }

                if($isProcess=true) {
                    $elementParameters = explode(",", $rest);
                    $aParameter = $elementParameters[$i];
                    $contadorUnico = $i + 1;
                    $parametroCount = ":P" . $contadorUnico;
                    self::$sqlEncripter = str_replace($parametroCount, "EMPTY_BLOB()", self::$sqlEncripter);
                    $queryReturn = " $aParameter into :mylob_loc_" . $contadorUnico . ",";
                }
            }
        }

        if($isBinary){
            $queryReturn=trim($queryReturn);
            $queryReturn=substr($queryReturn,0,(strlen($queryReturn)-1));
            self::$sqlEncripter=self::$sqlEncripter." RETURNING ".$queryReturn;
        }

    }

    static function cast_parametersORA($listParameters,$conn,$stmt){
        $param=new cornerstone_orm_client_Parameter();
        self::$countBlob=0;
        $n = $listParameters->length;
        $pname=array();
        $pvalue=array();
        for($i = 0; $i < $n; $i++) {
            $param= $listParameters[$i];
            $parameTypeHaxe=$param->get_DataType();
            $pname[]=":".$param->get_ParameterName();
            if($parameTypeHaxe=="VARCHAR"||$parameTypeHaxe=="BIGTEXT"||$parameTypeHaxe=="CHAR"
                ||$parameTypeHaxe=="NCHAR"||$parameTypeHaxe=="NBIGTEXT"||$parameTypeHaxe=="NCHAR"
                ||$parameTypeHaxe=="NVARCHAR"||$parameTypeHaxe=="VARCHAR") {
                $pvalue[] = utf8_encode($param->get_Value());
                oci_bind_by_name($stmt,$pname[$i],$pvalue[$i]);
            }else{
                if($parameTypeHaxe=="DATETIME") {
                    $dateHexe = $param->get_Value()->toString();
                    $pvalue[] = date_create($dateHexe)->format('Y-m-d H:i:s');
                    oci_bind_by_name($stmt,$pname[$i],$pvalue[$i]);
                }
                else {
                    if($parameTypeHaxe=="BINARY") {
                        //Preparacion para procesos blob
                        self::$lob[] = oci_new_descriptor($conn, OCI_D_LOB);
                        self::$lobOra=true;
                        $objectBlob=$param->get_Value();
                        $pvalue[] = $objectBlob->b->s;
                        self::$lobOraValue[]=$objectBlob->b->s;
                        $contadorUnico=$i+1;
                        oci_bind_by_name($stmt,":mylob_loc_".$contadorUnico, self::$lob[self::$countBlob], -1, OCI_B_BLOB);
                        self::$countBlob=self::$countBlob+1;
                    }else {
                        $pvalue[] = $param->get_Value();
                        oci_bind_by_name($stmt,$pname[$i],$pvalue[$i]);
                    }
                }
            }
        }

    }

    static function cast_parameter_type($parameter){
        //i to int,d to double,s to string,b to blob
        $parameter_type="";
        switch($parameter){
            case cornerstone_orm_common_enums_DBTypeEnum::$NCHAR:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$SMALLINTEGER:
                $parameter_type="i";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$INTEGER:
                $parameter_type="i";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$BIGINTEGER:
                $parameter_type="i";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$FLOAT:
                $parameter_type="d";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$REAL:
                $parameter_type="i";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$DECIMAL:
                $parameter_type="d";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$CHAR:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$VARCHAR:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$NVARCHAR:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$NBIGTEXT:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$BINARY:
                $parameter_type="b";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$DATETIME:
                $parameter_type="s";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$BOOLEAN:
                $parameter_type="i";
                break;
            case cornerstone_orm_common_enums_DBTypeEnum::$UUID:
                $parameter_type="i";
                break;
        }
        return $parameter_type;
    }
}