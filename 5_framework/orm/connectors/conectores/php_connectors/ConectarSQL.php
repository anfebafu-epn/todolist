<?php

/**
 * Created by IntelliJ IDEA.
 * User: Andrés
 * Date: 2/8/2017
 * Time: 10:43
 */
class ConectarSQL
{
    var $servername;
    var $database;
    var $username;
    var $password;
    var $serverPort;
    protected static $connection;

    function __construct($servername,$serverPort,$username,$password,$database) {
        $this->servername=$servername;
        $this->username=$username;
        $this->password=$password;
        $this->database=$database;
        $this->serverPort=$serverPort;
        $resultado=$this->conectarBD();
        return $resultado;
    }

    function TomarConeccion(){
        return self::$connection;
    }

    function conectarBD()
    {
        // Creamos la coneccion
        $connectionString=$this->servername.",".$this->serverPort;
        $connectionInfo = array("UID" => $this->username,
            "PWD" => $this->password,
            "Database" => $this->database);
        self::$connection = sqlsrv_connect($connectionString, $connectionInfo);
        if( self::$connection ) {
            return self::$connection;
        }else{
           die( print_r( sqlsrv_errors(), true));
            return null;
        }

    }

    function console_log( $data ){
        echo '<script>';
        echo 'console.log('. json_encode( $data ) .')';
        echo '</script>';
    }

    function desconectarBD(){
        sqlsrv_close(self::$connection);
        //$this->console_log("Coneccion Cerrada");
    }

}