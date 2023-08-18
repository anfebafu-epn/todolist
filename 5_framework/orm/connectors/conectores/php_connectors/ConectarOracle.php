<?php

/**
 * Created by IntelliJ IDEA.
 * User: Andrés
 * Date: 7/8/2017
 * Time: 15:22
 */
class ConectarOracle
{
    var $servername;
    var $port;
    var $database;
    var $username;
    var $password;
    protected static $connection;

    function __construct($servername, $port, $username, $password, $database)
    {
        $this->servername = $servername;
        $this->port = $port;
        $this->username = $username;
        $this->password = $password;
        $this->database = $database;
        $this->conectarBD();
    }

    function conectarBD()
    {
        $cadenaConeccion = $this->servername . ":" . $this->port . "/" . $this->database;
        self::$connection = oci_connect($this->username, $this->password, $cadenaConeccion);
        if (self::$connection) {
            //$this->console_log("coneccion establecida.");
            return self::$connection;
        } else {
            $e = oci_error();
            trigger_error(htmlentities($e['message'], ENT_QUOTES), E_USER_ERROR);
            //$this->console_log($e['message']);
            return null;
        }
    }

    function TomarConeccion(){
        //$this->console_log("Pasar Coneccion");
        //$this->console_log(self::$connection);
        return self::$connection;
    }

    function console_log($data)
    {
        echo '<script>';
        echo 'console.log(' . json_encode($data) . ')';
        echo '</script>';
    }

    function desconectarBD()
    {
        oci_close(self::$connection);
        //$this->console_log("Coneccion Cerrada");
    }
}

