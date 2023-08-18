<?php

/**
 * Created by IntelliJ IDEA.
 * User: Andrés
 * Date: 2/8/2017
 * Time: 10:43
 */
class Conectar
{
    var $servername;
    var $database;
    var $username;
    var $password;
    var $portServer;

    protected static $connection;
    function __construct($servername,$portServer,$username,$password,$database) {
        $this->servername=$servername;
        $this->username=$username;
        $this->password=$password;
        $this->database=$database;
        $this->portServer=$portServer;
        $resultado=$this->conectarBD();
        return $resultado;
    }
    function TomarConeccion(){
        return self::$connection;
    }
    function conectarBD(){
        // Creamos la coneccion
        $urlString=$this->servername.":".$this->portServer;
        self::$connection = new mysqli($urlString, $this->username, $this->password,$this->database);
        if (self::$connection->connect_error) {
            //$this->console_log("Error en Coneccion.". mysqli_error(self::$connection));
            echo "<br> error en conecccion <br>";
            return false;
        }else{
            //$this->console_log("Coneccion Realizada");
            return self::$connection;
        }
    }
    function console_log( $data ){
        echo '<script>';
        echo 'console.log('. json_encode( $data ) .')';
        echo '</script>';
    }
    function desconectarBD(){
        mysqli_close(self::$connection);
        //$this->console_log("Coneccion Cerrada");
    }
}