package nMorph.framework.svc.exceptions;
#if (!js && !flash)
import sys.io.File;
import sys.FileSystem;
#end
import haxe.Exception;
import haxe.PosInfos;
import nMorph.framework.common.configuration.Configuration;
import haxe.Serializer;
import nMorph.framework.svc.msg.RequestMessage;
import nMorph.framework.svc.msg.ResponseMessage;
import nMorph.framework.common.exceptions.LogicException;
import nMorph.framework.common.exceptions.SecurityException;

@:keep
class ExceptionManager {
    public static function HandleException(ex:Exception, ?DecryptedString:String, ?req:RequestMessage, ?LogicModule:String, ?LogicClass:String, ?LogicMethod:String, ?Name:String):String {
        var res:ResponseMessage = new ResponseMessage();
        var cc = Type.getClassName(Type.getClass(ex));
        if (cc == "nMorph.framework.common.exceptions.LogicException") {

            var le:LogicException = cast(ex, LogicException);
            res.AttentionCode = "" + le.Code;
            res.Message = le.message;
            res.RequestSeq = -1;
            res.Results = null;

        }
        else if (cc == "nMorph.framework.common.exceptions.SecurityException") {

            var le:SecurityException = cast(ex, SecurityException);
            res.AttentionCode = "" + le.Code;
            res.Message = le.message;
            res.RequestSeq = -2;
            res.Results = null;
        }
        else {

            #if (!js && !flash)
            var AttentionCode:String = Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99));

            while (true) {
                if (!FileSystem.exists(Configuration.Data.LogFolder + AttentionCode + ".txt"))
                    break;
                AttentionCode = Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99)) + Std.string(Std.random(99));
            }
			
            var logContent:String = "";
            logContent += "Message: " + ex.message + "\r\n";
            logContent += "StackTrace: " + ex.stack + "\r\n";
			logContent += "Details: " + ex.details() + "\r\n";
			if (ex.previous != null)
			{
				 
			}
            //if (ex.pos != null) {
                //logContent += "ClassName: " + ex.pos.className + "\r\n";
                //logContent += "MethodName: " + ex.pos.methodName + "\r\n";
                //logContent += "FileName: " + ex.pos.fileName + "\r\n";
                //logContent += "LineNumber: " + ex.pos.lineNumber + "\r\n";
            //}
            logContent += "Date: " + Date.now().toString() + "\r\n";

            //?DecryptedString:String, ?req:RequestMessage, ?LogicModule:String, ?LogicClass:String, ?LogicMethod:String, ?Name:String
            if (DecryptedString != null)
                logContent += "SerializedData: " + DecryptedString + "\r\n";
            if (req != null) {
                logContent += "RequestSeq: " + req.RequestSeq + "\r\n";
                logContent += "SessionID: " + req.SessionID + "\r\n";
                for (call in req.Calls) {
                    logContent += "-------------------" + "\r\n";
                    logContent += "Name: " + call.Name + "\r\n";
                    logContent += "LogicModule: " + call.LogicModule + "\r\n";
                    logContent += "LogicClass: " + call.LogicClass + "\r\n";
                    logContent += "LogicMethod: " + call.LogicMethod + "\r\n";
                    var pcount = 1;
                    for (p in call.LogicParams) {
                        logContent += "Param" + pcount + ": " + Std.string(p) + "\r\n";
                        pcount++;
                    }
                }
            }
            logContent += "-------------------" + "\r\n";
            logContent += "Localhost: " + sys.net.Host.localhost() + "\r\n";

            File.saveContent(Configuration.Data.LogFolder + AttentionCode + ".txt", logContent);

            res.AttentionCode = AttentionCode;
            res.Message = AttentionCode;
            res.RequestSeq = -3;
            res.Results = null;

            #end
        }

        var serializer = new Serializer();
        serializer.serialize(res);

        var ResponseString:String = serializer.toString();

        return ResponseString;


//        var ResponseBytes:Array<Int> = PKCS7.pad(UTF8.textToBytes(ResponseString), 16);
//
//        var EncryptedBytes:Array<Int> = AES.encrypt(Integrator.key, ResponseBytes, "CBC", Integrator.iv);
//
//        var PostReturn:String = Base64.encode(EncryptedBytes);
//
//        return PostReturn;

    }
    
}
