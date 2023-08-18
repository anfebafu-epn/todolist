<?php
error_reporting(E_ALL | E_STRICT);
ini_set('display_errors', 1);
ini_set('max_execution_time', 300); //300 seconds = 5 minutes

if (version_compare(PHP_VERSION, '5.1.0', '<')) {
    exit('Your current PHP version is: ' . PHP_VERSION . '. Needs version 5.1.0 or later');
};

set_include_path(get_include_path().PATH_SEPARATOR.__DIR__.'/lib');
spl_autoload_register(
	function($class){
		$file = stream_resolve_include_path(str_replace('\\', '/', $class) .'.php');
		if ($file) {
			include_once $file;
		}
	}
);

$configPath = __DIR__  . DIRECTORY_SEPARATOR . ".." . DIRECTORY_SEPARATOR . ".." . DIRECTORY_SEPARATOR  . "config" . DIRECTORY_SEPARATOR;
nMorph\core\service\configuration\Initializer::Application_Start($configPath);

\php\Boot::__hx__init();

//function global_exception_handler(Exception $ex)
//{
//    sw\framework\svc\exceptions\ExceptionManager::HandleException($ex, null, null, null,null, null, null);
//}
//
//set_exception_handler('global_exception_handler');

header("Content-Type: text/plain", true);
header("Access-Control-Allow-Origin: *", true);
header("Access-Control-Allow-Headers: content-type", true);

$PostData = "";
$ResData = "";

try {
    $PostData = file_get_contents('php://input');
	if ($PostData != "")
		$ResData = nMorph\framework\svc\transport\Router::Process($PostData);
	else
		$ResData = "nMorph Server";
}
catch (Exception $ex){
    nMorph\framework\svc\exceptions\ExceptionManager::HandleException($ex, $PostData, null, null, null, null, null);
}
echo $ResData;

//$f = fopen('php://stderr', 'w');
//fputs($f, 'Output');
