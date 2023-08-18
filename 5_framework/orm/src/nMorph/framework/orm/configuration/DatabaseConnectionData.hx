package nMorph.framework.orm.configuration;
import nMorph.framework.common.configuration.DeployEnvironmentEnum;

@:keep
class DatabaseConnectionData {
    public function new() {
    }

    @:isVar public var DatabaseEngine(get, set):DatabaseEngineEnum;
    @:isVar public var DeploEnvironment(get, set): DeployEnvironmentEnum;
    @:isVar public var DatabaseTypeAuthentication(get, set):DatabaseTypeAuthenticationEnum;

    @:isVar public var ConnectionString(get, set):String;
    @:isVar public var DataSource(get, set):String;
    @:isVar public var ServiceName(get, set):String;
    @:isVar public var SID(get, set):String;
    @:isVar public var UserID(get, set):String;
    @:isVar public var Password(get, set):String;
    @:isVar public var Database(get, set):String;
    @:isVar public var OtherParameters(get, set):Array<String>;
    @:isVar public var ServerPort(get, set):String;
	@:isVar public var ConnectionPoolSize(get, set):Int;
	@:isVar public var Schema(get, set):String;
	
	
	function get_ConnectionPoolSize():Int {
        return ConnectionPoolSize;
    }

    function set_ConnectionPoolSize(value:Int) {
        return this.ConnectionPoolSize = value;
    }
	

    function get_ServerPort():String {
        return ServerPort;
    }

    function set_ServerPort(value:String) {
        return this.ServerPort = value;
    }

    function get_DatabaseEngine():DatabaseEngineEnum {
        return DatabaseEngine;
    }

    function set_DatabaseEngine(value:DatabaseEngineEnum) {
        return this.DatabaseEngine = value;
    }

    function get_DeploEnvironment():DeployEnvironmentEnum {
        return DeploEnvironment;
    }

    function set_DeploEnvironment(value:DeployEnvironmentEnum) {
        return this.DeploEnvironment = value;
    }

    function get_ConnectionString():String {
        return ConnectionString;
    }

    function set_ConnectionString(value:String) {
        return this.ConnectionString = value;
    }

    function set_DataSource(value:String) {
        return this.DataSource = value;
    }

    function get_DataSource():String {
        return DataSource;
    }

    function set_ServiceName(value:String) {
        return this.ServiceName = value;
    }

    function get_ServiceName():String {
        return ServiceName;
    }

    function set_SID(value:String) {
        return this.SID = value;
    }

    function get_SID():String {
        return SID;
    }

    function set_UserID(value:String) {
        return this.UserID = value;
    }

    function get_UserID():String {
        return UserID;
    }

    function get_Password():String {
        return Password;
    }

    function set_Password(value:String) {
        return this.Password = value;
    }

    function get_Database():String {
        return Database;
    }

    function set_Database(value:String) {
        return this.Database = value;
    }

    function set_OtherParameters(value:Array<String>) {
        return this.OtherParameters = value;
    }

    function get_OtherParameters():Array<String> {
        return OtherParameters;
    }

    function get_DatabaseTypeAuthentication():DatabaseTypeAuthenticationEnum {
        return DatabaseTypeAuthentication;
    }

    function set_DatabaseTypeAuthentication(value:DatabaseTypeAuthenticationEnum):DatabaseTypeAuthenticationEnum {
        return this.DatabaseTypeAuthentication = value;
    }
	
	function get_Schema():String 
	{
		return Schema;
	}
	
	function set_Schema(value:String):String 
	{
		return Schema = value;
	}
	
}
