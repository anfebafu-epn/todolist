package nMorph.framework.orm.common.enums;

@:keepSub @:rtti
enum Op {
    MoreThan;
    LessThan;
    MoreThanAndEquals;
    LessThanAndEquals;
    Different;
    Equal;
    IN;
    NotIN;
    LIKE;
    NotLIKE;
}