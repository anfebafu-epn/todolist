package nMorph.framework.common.exceptions;

/**
 * ...
 * @author Smartwork
 */
@:keep
class ExceptionHelper 
{

	public function new() 
	{
		
	}
	
	public static function LogicException(Code:Int, Msg:String) {
        try {
            throw new LogicException(Code, Msg);
        }
        catch (e:Dynamic) {
            throw e;
        }
    }

    public static function SecurityException(Code:Int, Msg:String) {
        try {
            throw new SecurityException(Code, Msg);
        }
        catch (e:Dynamic) {
            throw e;
        }
    }
}