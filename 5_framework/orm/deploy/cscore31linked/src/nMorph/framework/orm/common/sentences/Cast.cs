// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.common.sentences {
	public class Cast : global::haxe.lang.HxObject, global::nMorph.framework.orm.interfaces.ISentence {
		
		static Cast() {
			global::nMorph.framework.orm.common.sentences.Cast.__rtti = "<class path=\"nMorph.framework.orm.common.sentences.Cast\" params=\"\">\n\t<implements path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<CastVarChartoInt public=\"1\" set=\"method\" line=\"27\" static=\"1\"><f a=\"Sentence:?Alias\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></CastVarChartoInt>\n\t<CastVarChartoDouble public=\"1\" set=\"method\" line=\"33\" static=\"1\"><f a=\"Sentence:?Alias\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></CastVarChartoDouble>\n\t<CastVarChartoBigInteger public=\"1\" set=\"method\" line=\"39\" static=\"1\"><f a=\"Sentence:?Alias\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></CastVarChartoBigInteger>\n\t<CastVarChartoDate public=\"1\" set=\"method\" line=\"45\" static=\"1\"><f a=\"Sentence:FormatDate:?Alias\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></CastVarChartoDate>\n\t<CastNumbertoVarChar public=\"1\" set=\"method\" line=\"51\" static=\"1\"><f a=\"Sentence:?Alias\">\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n</f></CastNumbertoVarChar>\n\t<CastTypeEnum><e path=\"nMorph.framework.orm.common.enums.CastTypeEnum\"/></CastTypeEnum>\n\t<Sentence><c path=\"nMorph.framework.orm.interfaces.ISentence\"/></Sentence>\n\t<CurrentSQL><c path=\"nMorph.framework.orm.lang.SQL\"/></CurrentSQL>\n\t<Alias><c path=\"String\"/></Alias>\n\t<FormatDate><c path=\"String\"/></FormatDate>\n\t<IsNullValue public=\"1\" set=\"method\" line=\"57\"><f a=\"\"><x path=\"Bool\"/></f></IsNullValue>\n\t<RegisterQuery public=\"1\" set=\"method\" line=\"62\"><f a=\"CurrentSQL\">\n\t<c path=\"nMorph.framework.orm.interfaces.ILang\"/>\n\t<x path=\"Void\"/>\n</f></RegisterQuery>\n\t<SCRIPT_PART public=\"1\" set=\"method\" line=\"68\"><f a=\"?args\">\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></SCRIPT_PART>\n\t<new public=\"1\" set=\"method\" line=\"19\"><f a=\"CastTypeEnum:Sentence:?Alias:?FormatDate\">\n\t<e path=\"nMorph.framework.orm.common.enums.CastTypeEnum\"/>\n\t<c path=\"nMorph.framework.orm.interfaces.ISentence\"/>\n\t<c path=\"String\"/>\n\t<c path=\"String\"/>\n\t<x path=\"Void\"/>\n</f></new>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
		}
		
		
		public Cast(global::haxe.lang.EmptyObject empty) {
		}
		
		
		public Cast(global::nMorph.framework.orm.common.enums.CastTypeEnum CastTypeEnum, global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias, string FormatDate) {
			global::nMorph.framework.orm.common.sentences.Cast.__hx_ctor_nMorph_framework_orm_common_sentences_Cast(this, CastTypeEnum, Sentence, Alias, FormatDate);
		}
		
		
		protected static void __hx_ctor_nMorph_framework_orm_common_sentences_Cast(global::nMorph.framework.orm.common.sentences.Cast __hx_this, global::nMorph.framework.orm.common.enums.CastTypeEnum CastTypeEnum, global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias, string FormatDate) {
			__hx_this.CastTypeEnum = CastTypeEnum;
			__hx_this.Sentence = Sentence;
			__hx_this.Alias = Alias;
			__hx_this.FormatDate = FormatDate;
		}
		
		
		public static string __rtti;
		
		public static global::nMorph.framework.orm.interfaces.ISentence CastVarChartoInt(global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias) {
			global::nMorph.framework.orm.common.sentences.Cast Cast = new global::nMorph.framework.orm.common.sentences.Cast(((global::nMorph.framework.orm.common.enums.CastTypeEnum) (global::nMorph.framework.orm.common.enums.CastTypeEnum.CastVarChartoInt) ), ((global::nMorph.framework.orm.interfaces.ISentence) (Sentence) ), ((string) (Alias) ), default(string));
			return Cast;
		}
		
		
		public static global::nMorph.framework.orm.interfaces.ISentence CastVarChartoDouble(global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias) {
			global::nMorph.framework.orm.common.sentences.Cast Cast = new global::nMorph.framework.orm.common.sentences.Cast(((global::nMorph.framework.orm.common.enums.CastTypeEnum) (global::nMorph.framework.orm.common.enums.CastTypeEnum.CastVarChartoDouble) ), ((global::nMorph.framework.orm.interfaces.ISentence) (Sentence) ), ((string) (Alias) ), default(string));
			return Cast;
		}
		
		
		public static global::nMorph.framework.orm.interfaces.ISentence CastVarChartoBigInteger(global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias) {
			global::nMorph.framework.orm.common.sentences.Cast Cast = new global::nMorph.framework.orm.common.sentences.Cast(((global::nMorph.framework.orm.common.enums.CastTypeEnum) (global::nMorph.framework.orm.common.enums.CastTypeEnum.CastVarChartoBigInteger) ), ((global::nMorph.framework.orm.interfaces.ISentence) (Sentence) ), ((string) (Alias) ), default(string));
			return Cast;
		}
		
		
		public static global::nMorph.framework.orm.interfaces.ISentence CastVarChartoDate(global::nMorph.framework.orm.interfaces.ISentence Sentence, string FormatDate, string Alias) {
			global::nMorph.framework.orm.common.sentences.Cast Cast = new global::nMorph.framework.orm.common.sentences.Cast(((global::nMorph.framework.orm.common.enums.CastTypeEnum) (global::nMorph.framework.orm.common.enums.CastTypeEnum.CastVarChartoDate) ), ((global::nMorph.framework.orm.interfaces.ISentence) (Sentence) ), ((string) (Alias) ), ((string) (FormatDate) ));
			return Cast;
		}
		
		
		public static global::nMorph.framework.orm.interfaces.ISentence CastNumbertoVarChar(global::nMorph.framework.orm.interfaces.ISentence Sentence, string Alias) {
			global::nMorph.framework.orm.common.sentences.Cast Cast = new global::nMorph.framework.orm.common.sentences.Cast(((global::nMorph.framework.orm.common.enums.CastTypeEnum) (global::nMorph.framework.orm.common.enums.CastTypeEnum.CastNumbertoVarChar) ), ((global::nMorph.framework.orm.interfaces.ISentence) (Sentence) ), ((string) (Alias) ), default(string));
			return Cast;
		}
		
		
		public global::nMorph.framework.orm.common.enums.CastTypeEnum CastTypeEnum;
		
		public global::nMorph.framework.orm.interfaces.ISentence Sentence;
		
		public global::nMorph.framework.orm.lang.SQL CurrentSQL;
		
		public string Alias;
		
		public string FormatDate;
		
		public virtual bool IsNullValue() {
			return false;
		}
		
		
		public virtual void RegisterQuery(global::nMorph.framework.orm.interfaces.ILang CurrentSQL) {
			this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (CurrentSQL) );
			this.Sentence.RegisterQuery(CurrentSQL);
		}
		
		
		public virtual void SCRIPT_PART(string args) {
			unchecked {
				switch (this.CurrentSQL.getCurrentEngine()._hx_index) {
					case 0:
					{
						switch (this.CastTypeEnum._hx_index) {
							case 0:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS int) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS int) ");
								}
								
								break;
							}
							
							
							case 1:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS decimal(9,2)) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock("AS decimal(9,2)) ");
								}
								
								break;
							}
							
							
							case 2:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS bigint) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS bigint) ");
								}
								
								break;
							}
							
							
							case 3:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CONVERT(datetime,");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(") AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CONVERT(datetime,");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(") ");
								}
								
								break;
							}
							
							
							case 4:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS CHAR) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS CHAR) ");
								}
								
								break;
							}
							
							
						}
						
						break;
					}
					
					
					case 1:
					{
						switch (this.CastTypeEnum._hx_index) {
							case 0:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS INTEGER) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS INTEGER) ");
								}
								
								break;
							}
							
							
							case 1:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS NUMERIC(17,2)) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS NUMERIC(17,2)) ");
								}
								
								break;
							}
							
							
							case 2:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS NUMBER(18)) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS NUMBER(18)) ");
								}
								
								break;
							}
							
							
							case 3:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("TO_DATE(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") AS \""), this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("TO_DATE(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") "));
								}
								
								break;
							}
							
							
							case 4:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("TO_CHAR(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" ) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("TO_CHAR(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" ) ");
								}
								
								break;
							}
							
							
						}
						
						break;
					}
					
					
					case 2:
					{
						switch (this.CastTypeEnum._hx_index) {
							case 0:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS UNSIGNED) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS UNSIGNED) ");
								}
								
								break;
							}
							
							
							case 1:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS DECIMAL(9,2)) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS DECIMAL(9,2)) ");
								}
								
								break;
							}
							
							
							case 2:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS UNSIGNED integer) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS UNSIGNED integer) ");
								}
								
								break;
							}
							
							
							case 3:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("str_to_date(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") AS \""), this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("str_to_date(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") "));
								}
								
								break;
							}
							
							
							case 4:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS CHAR) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS CHAR) ");
								}
								
								break;
							}
							
							
						}
						
						break;
					}
					
					
					case 3:
					{
						switch (this.CastTypeEnum._hx_index) {
							case 0:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS INT) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS INT) ");
								}
								
								break;
							}
							
							
							case 1:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" as double precision) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" as double precision) ");
								}
								
								break;
							}
							
							
							case 2:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS bigint) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS bigint) ");
								}
								
								break;
							}
							
							
							case 3:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("TO_DATE(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") AS \""), this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("TO_DATE(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(",\"", this.FormatDate), "\") "));
								}
								
								break;
							}
							
							
							case 4:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS CHAR) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS CHAR) ");
								}
								
								break;
							}
							
							
						}
						
						break;
					}
					
					
					case 4:
					{
						switch (this.CastTypeEnum._hx_index) {
							case 0:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS int) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS int) ");
								}
								
								break;
							}
							
							
							case 1:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS decimal(9,2)) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock("AS decimal(9,2)) ");
								}
								
								break;
							}
							
							
							case 2:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS bigint) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS bigint) ");
								}
								
								break;
							}
							
							
							case 3:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CONVERT(datetime,");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(") AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CONVERT(datetime,");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(") ");
								}
								
								break;
							}
							
							
							case 4:
							{
								if (( this.Alias != null )) {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(" AS CHAR) AS \"", this.Alias), "\" "));
								}
								else {
									this.CurrentSQL.AddBlock("CAST(");
									this.Sentence.SCRIPT_PART(null);
									this.CurrentSQL.AddBlock(" AS CHAR) ");
								}
								
								break;
							}
							
							
						}
						
						break;
					}
					
					
				}
				
			}
		}
		
		
		public override object __hx_setField(string field, int hash, object @value, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2021227813:
					{
						this.FormatDate = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 884916592:
					{
						this.Alias = global::haxe.lang.Runtime.toString(@value);
						return @value;
					}
					
					
					case 1038308213:
					{
						this.CurrentSQL = ((global::nMorph.framework.orm.lang.SQL) (@value) );
						return @value;
					}
					
					
					case 2082877635:
					{
						this.Sentence = ((global::nMorph.framework.orm.interfaces.ISentence) (@value) );
						return @value;
					}
					
					
					case 164293850:
					{
						this.CastTypeEnum = ((global::nMorph.framework.orm.common.enums.CastTypeEnum) (@value) );
						return @value;
					}
					
					
					default:
					{
						return base.__hx_setField(field, hash, @value, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_getField(string field, int hash, bool throwErrors, bool isCheck, bool handleProperties) {
			unchecked {
				switch (hash) {
					case 2032371175:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "SCRIPT_PART", 2032371175)) );
					}
					
					
					case 457416069:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "RegisterQuery", 457416069)) );
					}
					
					
					case 150705664:
					{
						return ((global::haxe.lang.Function) (new global::haxe.lang.Closure(this, "IsNullValue", 150705664)) );
					}
					
					
					case 2021227813:
					{
						return this.FormatDate;
					}
					
					
					case 884916592:
					{
						return this.Alias;
					}
					
					
					case 1038308213:
					{
						return this.CurrentSQL;
					}
					
					
					case 2082877635:
					{
						return this.Sentence;
					}
					
					
					case 164293850:
					{
						return this.CastTypeEnum;
					}
					
					
					default:
					{
						return base.__hx_getField(field, hash, throwErrors, isCheck, handleProperties);
					}
					
				}
				
			}
		}
		
		
		public override object __hx_invokeField(string field, int hash, object[] dynargs) {
			unchecked {
				switch (hash) {
					case 2032371175:
					{
						this.SCRIPT_PART(global::haxe.lang.Runtime.toString(( (( dynargs.Length > 0 )) ? (dynargs[0]) : (null) )));
						break;
					}
					
					
					case 457416069:
					{
						this.RegisterQuery(((global::nMorph.framework.orm.interfaces.ILang) (dynargs[0]) ));
						break;
					}
					
					
					case 150705664:
					{
						return this.IsNullValue();
					}
					
					
					default:
					{
						return base.__hx_invokeField(field, hash, dynargs);
					}
					
				}
				
				return null;
			}
		}
		
		
		public override void __hx_getFields(global::Array<string> baseArr) {
			baseArr.push("FormatDate");
			baseArr.push("Alias");
			baseArr.push("CurrentSQL");
			baseArr.push("Sentence");
			baseArr.push("CastTypeEnum");
			base.__hx_getFields(baseArr);
		}
		
		
	}
}


