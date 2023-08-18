declare namespace nMorph.framework.svc.msg {
    class RequestMessage {
        constructor();
        set_RequestSeq(value: number): number;
        get_RequestSeq(): number;
        get_SessionID(): string;
        set_SessionID(value: string): string;
        get_Calls(): nMorph.framework.svc.transport.MethodCall[];
        set_Calls(value: nMorph.framework.svc.transport.MethodCall[]): nMorph.framework.svc.transport.MethodCall[];
    }

    class ResponseMessage {
        constructor();
        set_Results(value: nMorph.framework.svc.transport.MethodResult[]): nMorph.framework.svc.transport.MethodResult[];
        get_Results(): nMorph.framework.svc.transport.MethodResult[];
        set_RequestSeq(value: number): number;
        get_RequestSeq(): number;
        set_Message(value: string): string;
        get_Message(): string;
        get_AttentionCode(): string;
        set_AttentionCode(value: string): string;
    }
}

declare namespace nMorph.framework.common.datatypes {
    class UUID {
        constructor();
        setValue(UUIDString: String): UUID;
        equals(b: UUID): Boolean;
        getValue(): String;
        toString(): String;
        getShort(): String;
        getNano(): String;
        getBytes(): haxe.io.Bytes;
        setValuefromBytes(UUIDBytes: haxe.io.Bytes): UUID;
        static empty(): UUID;
        static fromBytes(UUIDBytes: haxe.io.Bytes);
        static newUUID(): UUID;
        static fromString(UUIDString: String): UUID;
        isEMPTY(): Boolean;
        isNULL(): Boolean;
        static __name__: string;
        __class__: typeof UUID;
    }
}

declare namespace haxe.io {
    class Bytes {
        length: number;
        b: any;
        get(pos: number): number;
        set(pos: number, v: number);
        blit(pos: number, src: Bytes, srcpos: number, len: number);
        fill(pos: number, len: number, value: number);
        sub(pos: number, len: number): Bytes;
        compare(other: Bytes): number;
        getDouble(pos: number): number;
        getFloat(pos: number): number;
        setDouble(pos: number, v: number);
        setFloat(pos: number, v: number);
        getUInt16(pos: number): number;
        setUInt16(pos: number, v: number);
        getInt32(pos: number): number;
        setInt32(pos: number, v: number);
        getInt64(pos: number): number;
        setInt64(pos: number, v: number);
        getString(pos: number, len: number, encoding: Encoding): string; // encoding
        readString(pos: number, len: number): string;
        toString(): string;
        toHex(): string;
        getData(): any;
    }
    enum Encoding {
        UTF8,
        RawNative
    }

}

declare namespace nMorph.framework.svc.transport {



    class MethodCall {
        constructor();
        set_LogicModule(value: string): string;
        get_LogicModule(): string;
        set_LogicClass(value: string): string;
        get_LogicClass(): string;
        set_LogicMethod(value: string): string;
        get_LogicMethod(): string;
        set_LogicParams(value: any[]): any[];
        get_LogicParams(): any[];
        get_Name(): string;
        set_Name(value: string): string;
    }

    class MethodResult {
        constructor();
        get_ReturnObject(): any;
        set_ReturnObject(value: any): any;
        get_Name(): string;
        set_Name(value: string): string;
    }
}
declare namespace nMorph.core.proxy.tools {

    /**
    * Método que permite invocar a los métodos de lógica
    * @author Smartwork
    */
    class Packager {
        constructor();
        static Serialize(obj: any): string;
        static Unserialize(SerializedStr: string): any;
    }


}