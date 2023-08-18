<?php

/**
 * Created by IntelliJ IDEA.
 * User: Andrés
 * Date: 7/8/2017
 * Time: 11:27
 */
class ConectarPG
{
    var $servername;
    var $port;
    var $database;
    var $username;
    var $password;
    protected static $connection;

    function __construct($servername,$port,$username,$password,$database) {
        $this->servername=$servername;
        $this->port=$port;
        $this->username=$username;
        $this->password=$password;
        $this->database=$database;
        $this->conectarBD();
    }

    function conectarBD()
    {
        $cadenaConeccion="host=".$this->servername." port=".strval($this->port)." dbname=".$this->database." user=".$this->username." password=".$this->password."";
        self::$connection = pg_connect($cadenaConeccion);
        if( self::$connection ) {
            //$this->console_log("Conexión establecida.");
            return self::$connection;
        }else{
            //$this->console_log("Conexión no se pudo establecer.");
            return null;
        }
    }

    function TomarConeccion(){
        return self::$connection;
    }

    function console_log( $data ){
        echo '<script>';
        echo 'console.log('. json_encode( $data ) .')';
        echo '</script>';
    }

    function desconectarBD(){
        //$this->console_log("Coneccion Cerrada");
        pg_close(self::$connection);
    }

}