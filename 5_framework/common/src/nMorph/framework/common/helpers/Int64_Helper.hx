package nMorph.framework.common.helpers;
import haxe.Int64;

@:keep
class Int64_Helper {
    private inline static var MAX_32_PRECISION:Float = 4294967296.0;

    public static function fromFloat(f:Float):Int64 {
        var h = Std.int(f / MAX_32_PRECISION);
        var l = Std.int(f);
        return Int64.make(h, l);
    }

    public static function toFloat(i:Int64):Float {
        var f:Float = i.low; //Int64.getLow(i);
        if (f < 0) f += MAX_32_PRECISION;
        return (i.high * MAX_32_PRECISION + f); //Int64.getHigh(i)
    }
}
