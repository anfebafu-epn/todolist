// Generated by Haxe 4.2.2

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.lang {
	public sealed class FieldHashConflict {
		
		public FieldHashConflict(int hash, string name, object @value, global::haxe.lang.FieldHashConflict next) {
			this.hash = hash;
			this.name = name;
			this.@value = @value;
			this.next = next;
		}
		
		
		public readonly int hash;
		
		public readonly string name;
		
		public object @value;
		
		public global::haxe.lang.FieldHashConflict next;
		
	}
}



#pragma warning disable 109, 114, 219, 429, 168, 162
namespace haxe.lang {
	public sealed class FieldLookup {
		
		#pragma warning disable 628
		static FieldLookup() {
			global::haxe.lang.FieldLookup.length = ( global::haxe.lang.FieldLookup.fieldIds as global::System.Array ).Length;
		}
		
		
		public FieldLookup() {
		}
		
		
		protected static int[] fieldIds = new int[]{98, 104, 105, 109, 113, 115, 17699, 22179, 22636, 22848, 22862, 23072, 23296, 23520, 23977, 1332402, 1821933, 3249847, 4142978, 4143854, 4145646, 4745537, 4846113, 4849249, 4899635, 4947588, 4949376, 4995541, 4996429, 5047484, 5049505, 5144726, 5145602, 5194459, 5243965, 5246186, 5343647, 5393365, 5442204, 5442212, 5443986, 5594513, 5594516, 5693967, 5695307, 5741474, 5744817, 5745024, 5841808, 10319920, 13876232, 14126871, 14532012, 22835468, 24046298, 25738091, 25795754, 35715077, 37335010, 42740551, 43737796, 44655708, 46374763, 50085628, 52644165, 56251104, 57219237, 59383703, 65245323, 67856200, 67859554, 68006728, 70342771, 72054786, 72252782, 76061764, 78945784, 81314120, 82105844, 87367608, 90799561, 93527321, 96701633, 96903864, 103479213, 106050572, 108828507, 112843575, 113994422, 125111323, 127488538, 131877269, 132916898, 133414859, 134961036, 135540656, 142151465, 142301684, 142605435, 143608744, 150705664, 159136996, 165031765, 165115113, 169239498, 172955042, 175768334, 179047623, 188431961, 194253921, 201080426, 206581807, 207609411, 208459108, 212892678, 214678700, 216537025, 221637784, 222029606, 222994060, 225306040, 226931207, 231873366, 234584065, 237011694, 243225909, 244830897, 245554775, 247036618, 252173918, 252174139, 252174360, 253048465, 261031087, 261985488, 262801146, 268147898, 269919080, 274435967, 276566778, 281751194, 286997415, 288167040, 292136529, 293985672, 294242834, 294620923, 298684375, 300675105, 302979532, 306935545, 309502035, 311106773, 311106994, 312752480, 328878574, 330205275, 331416730, 334695532, 336134320, 336655392, 343868310, 344226501, 346320869, 349593511, 350619104, 350619108, 353204262, 358990357, 359333139, 364521520, 365188593, 376065817, 384816719, 389426697, 391692349, 397576573, 400509660, 403152826, 403850708, 404153790, 407283053, 414012942, 416397713, 417560631, 425603605, 426437333, 431330449, 431332241, 433212388, 437335495, 444663929, 451001976, 452737314, 453629873, 456336029, 457057640, 457416069, 457720365, 461513450, 464885577, 465747725, 468676152, 471646806, 474209209, 474773467, 475410908, 480756972, 481675004, 481768284, 492737971, 493819893, 499574632, 501039929, 502768344, 502769015, 503524458, 503761275, 505731012, 517594156, 520590566, 520665567, 525508230, 528448451, 537630174, 540399897, 542823803, 548310786, 552454336, 563341800, 564757790, 572311959, 572839290, 578936635, 589000550, 589599061, 590356524, 591404329, 592725523, 594052472, 596483356, 598785079, 600499589, 603885322, 605915487, 608071446, 610723709, 611494939, 611781476, 614073432, 615362857, 617152032, 617979119, 620286782, 625244752, 630156697, 632489357, 640252688, 649331589, 649333381, 650414942, 651890926, 652216925, 652994848, 656317017, 658807405, 659491187, 666925948, 669614744, 673831906, 679246149, 694381261, 697505964, 701410669, 703544457, 704022367, 709859532, 709976707, 710668999, 713699537, 714500548, 714730370, 723690193, 724060212, 727112898, 737753906, 742854407, 744003798, 744358035, 746281503, 748543309, 750059113, 752297450, 752407269, 757656754, 758097041, 766915428, 769672611, 772311838, 772312059, 774126585, 780365162, 782495260, 783580945, 784433846, 784516811, 790737991, 791601943, 797047842, 804763062, 809592225, 813914181, 815034560, 821570219, 827643751, 832635986, 834174833, 834990575, 838867488, 840222871, 845179051, 846454103, 849624764, 854086211, 855935792, 857974127, 860645958, 863972113, 865108302, 865294836, 869101212, 869834347, 869850046, 877441228, 878103594, 884916592, 885086664, 887376854, 889051340, 893862549, 895824481, 910198946, 910349087, 910351554, 914388854, 914888598, 914891065, 918861722, 922037898, 922671056, 923884177, 925284189, 925482673, 925597908, 930986349, 930987020, 937267591, 940442543, 942927226, 942990276, 946786476, 949043973, 953074276, 963653336, 977008262, 979246492, 985353469, 994736977, 995006396, 995233036, 997465939, 1007475569, 1008670959, 1009618592, 1011363047, 1014246591, 1021796563, 1024542152, 1032703036, 1037559379, 1038308213, 1042631443, 1046234758, 1046567008, 1058556349, 1066783641, 1067353468, 1071652316, 1072490607, 1072885311, 1081380189, 1084937405, 1088942801, 1091869250, 1092171829, 1101712806, 1103412149, 1107413962, 1113806382, 1114201093, 1115891669, 1126920507, 1129291996, 1131399237, 1132776412, 1134188378, 1136381564, 1136381571, 1138719159, 1143175375, 1151917883, 1152280640, 1154932936, 1155848147, 1155919697, 1158359328, 1158462813, 1164821372, 1165197207, 1169995914, 1170195731, 1171620962, 1177754921, 1181037546, 1185232084, 1185258323, 1191336021, 1191633396, 1191829406, 1202223047, 1202522710, 1202718727, 1203028895, 1203218020, 1203742590, 1204059472, 1204816148, 1211089610, 1212528822, 1213952397, 1214305123, 1214453688, 1224901644, 1224901875, 1225098545, 1230265810, 1238832007, 1241608805, 1247712721, 1247875546, 1247989211, 1250718309, 1253923808, 1256505177, 1257164128, 1257939113, 1264619015, 1269206179, 1269254998, 1269755426, 1271070480, 1273207865, 1274465926, 1275479599, 1280345464, 1280549057, 1280638028, 1280638699, 1280845662, 1281093634, 1282943179, 1290148730, 1291436593, 1292916749, 1302870512, 1309344294, 1312666830, 1313416818, 1315911912, 1318659268, 1319110770, 1324505717, 1326920980, 1335922868, 1336253121, 1337394146, 1344235664, 1348037855, 1352270080, 1352786672, 1356397662, 1360149472, 1380175813, 1381630732, 1389209528, 1390395051, 1390578741, 1390578962, 1390579183, 1395555037, 1398032709, 1400771174, 1402734854, 1407671330, 1411496475, 1414400282, 1429871584, 1436217547, 1438490722, 1438895782, 1439849010, 1445635792, 1450731704, 1450762973, 1457234834, 1460447810, 1461701513, 1464702148, 1466589425, 1469813572, 1483167065, 1484998194, 1488000822, 1489662016, 1491924387, 1491961287, 1495294241, 1503920168, 1511098150, 1512997393, 1516099318, 1521873482, 1529739092, 1532710347, 1535697261, 1537812987, 1543410694, 1547440149, 1547539107, 1553828609, 1558459130, 1563542256, 1570685221, 1575652753, 1575817284, 1576149820, 1581366158, 1581593479, 1582403597, 1594446480, 1607672688, 1611134935, 1614780307, 1620824029, 1621420777, 1623148745, 1633791960, 1633912908, 1639293562, 1643164520, 1648581351, 1651365158, 1658827638, 1669033097, 1670773894, 1674457882, 1678411344, 1685679198, 1688218771, 1688221238, 1692073793, 1705223245, 1705629508, 1708983306, 1711741140, 1714327076, 1717370737, 1723805383, 1724261627, 1728782031, 1729225167, 1738690008, 1743760500, 1746557202, 1754853720, 1762221918, 1763375486, 1764121850, 1767547518, 1768164316, 1769664288, 1771930571, 1775015837, 1780229452, 1787346243, 1789265245, 1789423016, 1794072594, 1797611211, 1808079067, 1809738659, 1809856436, 1815533258, 1816214113, 1821685432, 1825849507, 1828505873, 1830310359, 1836749923, 1837892969, 1840387740, 1840394978, 1840455391, 1851766731, 1855723769, 1861102094, 1864494649, 1868388187, 1871712989, 1873474154, 1873681412, 1875751333, 1881123123, 1885412888, 1887596712, 1889717695, 1891834246, 1893491216, 1894423562, 1895567566, 1897396968, 1897397617, 1899092963, 1899172096, 1909035639, 1915412854, 1915670206, 1916009602, 1916097898, 1920084442, 1932361917, 1937159360, 1937562053, 1955029599, 1962040800, 1968542785, 1969727692, 1981972957, 1988341510, 1993004027, 1997001418, 1998628419, 2005380545, 2008853145, 2010580328, 2011811227, 2012934199, 2022294396, 2025055113, 2025238049, 2026329742, 2029008698, 2032371175, 2036759185, 2044918283, 2047321060, 2048311260, 2048392659, 2050687199, 2052010495, 2056840295, 2061694121, 2064117770, 2065679094, 2079583163, 2082268609, 2082663554, 2082877635, 2083500811, 2083808323, 2103468489, 2107499704, 2113708439, 2121237459, 2123232567, 2127021138, 2131770120, 2139218226, 2147276159};
		
		protected static string[] fields = new string[]{"b", "h", "i", "m", "q", "s", "OR", "cf", "eq", "ff", "ft", "gg", "hh", "ii", "kt", "get_position", "isGlobal", "AND", "SET", "SID", "SQL", "__a", "add", "arr", "buf", "cmn", "cur", "dev", "dir", "eof", "ext", "get", "gid", "hex", "idx", "ino", "key", "len", "map", "max", "min", "pop", "pos", "rol", "run", "set", "str", "sub", "uid", "first", "PrimaryKeyName", "set_FullName", "resolveClass", "oneTimeEvents", "split", "exitCode", "get_ColumnName", "FieldName", "VALUES", "flags", "flush", "OnCondition", "readAll", "Email", "match", "AgType", "compare", "get_PkCondition", "Querys", "stack", "start", "stdin", "get_Description", "Values", "helper", "remove", "__previousException", "setBytesValue", "set_queue", "filter", "Category_Search", "get_ColumnType", "set_ServerPort", "merge", "progress", "DROPPRIMARYKEY", "repeat", "hxUnserialize", "GROUPBY", "hashCode", "waitCount", "CustomQueries", "stderr", "stdout", "AddBlock", "RENAMETABLE", "classString", "resize", "useCache", "get_Value", "IsNullValue", "matched", "GeneratedBlocks", "ClearInner", "NotLIKE", "getFullYear", "get_DataSource", "readString", "getHours", "ColumnName", "Scale", "ConditionGroups", "isEmpty", "parseString", "resolver", "get_ObjectEditType", "Nullable", "__nativeException", "setLoop", "Category_Delete", "RenderCurrentCondition", "getString", "set_CategoryId", "doEncode", "Task_GetByID", "readBytes", "compareArg", "get_ChangeList", "thread", "readInt16", "readInt24", "readInt32", "getUTCMinutes", "get_length", "ColumnType", "mtime", "set_DatabaseEngine", "AddParameter", "mutex", "DatabaseConnections", "setFloat", "IsPrimaryKey", "stream", "AddChange", "releaseCount", "Person_Search", "getValue", "set_ParameterName", "IsCompleted", "methodName", "get_PersonId", "setDouble", "readUInt16", "readUInt24", "get_native", "iterator", "AND_Ex", "Field", "indent", "hxSerialize", "toHex", "dateUTC", "DataSource", "Attach", "Category_GetByID", "getData", "getDate", "set_position", "getUInt16", "lastIndexOf", "get_IsPrimaryKey", "getUTCSeconds", "events", "serializeException", "get_LogFolder", "writeFloat", "DatabaseEngine", "totlen", "SetExpression", "set_Queue", "replacer", "hasNext", "ChangeList", "get_DatabaseConnections", "get_Items", "Execute", "Person_Delete", "set_SID", "set_SQL", "JoinType", "message", "serializeFields", "keysLoop", "reverse", "IsNull", "set_DatabaseConnections", "ConstraintName", "RegisterQuery", "get_DataType", "getNano", "UnionType", "promisedEventsCount", "InnerSQL", "get_DatabaseTypeAuthentication", "addme", "tryAcquire", "ValidateDBCompatibility", "nOccupied", "SELECT", "parseNumber", "get_HXType", "getBytes", "nlink", "insert", "getInt32", "getInt64", "ChangeType", "Condition", "Operator", "ParName", "length", "addSub", "unserializeObject", "getTime", "get_message", "anyTime", "bigEndian", "LogicOperator", "StringValue", "get_queue", "set_ColumnName", "native", "OtherParameters", "Password", "getDay", "getPid", "set_ConnectionString", "getMinutes", "RemoveLastBlock", "Title", "balance", "previous", "AddConditionGroup", "useEnumIndex", "sendMessage", "HavingCondition", "writeFullBytes", "ReadValue", "get_Database", "matchedRight", "BaseExpression", "isNullValue", "UNION", "Person_GetByID", "Sentences", "array", "set_ColumnType", "writeString", "get_SID", "get_SQL", "set_bigEndian", "atime", "IndexName", "invalidNumber", "get_LogicOperator", "set_PersonId", "get_OldValue", "getUTCDate", "Conditions", "DueDate", "interval", "__progress", "BaseColumns", "invalidChar", "getSeconds", "set_Email", "GenerateAll", "Register", "BoolValue", "get_BlockCode", "setIntValue", "set_DataSource", "serializeString", "replace", "details", "Bulk", "readDouble", "get_Code", "CurrentDeployEnvironment", "contains", "Code", "get_TaskId", "HXType", "setBoolValue", "get_CreatedAt", "get_OtherParameters", "get_ConnectionPoolSize", "set_ServiceName", "writeUInt16", "writeUInt24", "get_DueDate", "FROM", "readDigits", "NewValue", "pretty", "set_ChangeList", "getDouble", "set_ObjectSource", "OldParameter", "MoreThan", "set_DataType", "nextRunTime", "Into", "randomByte", "Person_Save", "setValuefromBytes", "value", "get_BlockName", "HaxeType", "get_ServiceName", "quotient", "LIKE", "getResolver", "DateValue", "bitOR", "OR_Ex", "get_DatabaseEngine", "__nativeStack", "ContainsClause", "get_Name", "get_CurrentDDL", "Name", "get_CurrentSQL", "lockObj", "fieldsString", "Alias", "get_Queue", "acquire", "messages", "regularEvents", "setDateValue", "compareArgs", "get_Role", "get_Rows", "Read", "Role", "Rows", "FullName", "addBytes", "cachedIndex", "SETS", "Save", "Sets", "runPromised", "addInt32", "addInt64", "prepare", "ConnectionString", "cancel", "Clauses", "toString", "set_DueDate", "Int64Value", "set_Database", "AddQueryBlock", "LessThanAndEquals", "set_Field", "GroupSentences", "hashes", "ALTERCOLUMN", "serializeRef", "LEFTJOIN", "scache", "TaskId", "set_OldValue", "get_ParameterDirection", "releaseEvent", "setResolver", "ColumnIndex", "CurrentDDL", "CurrentSQL", "get_Parameters", "set_CategoryName", "INNERJOIN", "_eof", "__exceptionStack", "splice", "exists", "setValue", "equals", "args", "Columns", "set_NameModified", "cache", "blit", "RIGHTJOIN", "copy", "get_Nullable", "date", "diff", "set_TrackChanges", "matchSub", "Description", "DROPCOLUMN", "get_FieldName", "AddCondition", "file", "fill", "Task_Save", "get_Length", "storage", "UniqueQueryNumber", "removeLoop", "minBinding", "Value", "head", "get_FieldTable", "scount", "ADDCOLUMN", "ipad", "item", "getTimezoneOffset", "__skipStack", "join", "get_Columns", "get_Email", "FloatValue", "keys", "kill", "WHERE", "last", "left", "get_stack", "loop", "set_DeploEnvironment", "writeDouble", "concat", "Parameters", "backslash", "clear", "mode", "close", "newl", "next", "nind", "addString", "writeByte", "getCurrentEngine", "UpdateField", "push", "set_Title", "set_LogicOperator", "MoreThanAndEquals", "Different", "keyValueIterator", "position", "OldTable", "rdev", "read", "root", "matchedPos", "current", "__shiftStack", "assign", "seek", "size", "setInt32", "setInt64", "sort", "stop", "quicksort", "LessThan", "tell", "DatabaseTypeAuthentication", "ctime", "readFullBytes", "getUTCDay", "vals", "writeInt8", "set_IsCompleted", "ReferenceColumns", "wait", "FieldTable", "Objects", "get_Scale", "values", "ReadOne", "write", "waitLock", "spliceVoid", "ADDPRIMARYKEY", "set_Columns", "InnerClause", "writeBytes", "get_IsCompleted", "writeInput", "writeInt16", "writeInt24", "writeInt32", "cachedKey", "InnerCondition", "readFloat", "Length", "IntValue", "ConnectionPoolSize", "ObjectSource", "Items", "get_Objects", "Task_Search", "set_PasswordHash", "LogFolder", "eventHandler", "get_ConnectionString", "parseRec", "ExpressionToCompare", "__ownStack", "get_CurrentDatabaseConnection", "get_Source", "get_Field", "get_Password", "TableName", "getUTCMonth", "UUIDValue", "get_previous", "get_ObjectSource", "release", "get_DBType", "objString", "BytesValue", "posInfos", "ForeignKeyName", "set_Code", "setUUIDValue", "concatNative", "Clear", "nBuckets", "getShort", "set_LogFolder", "className", "DeploEnvironment", "nextEventAt", "PersonId", "Task_Delete", "queue", "TableOldName", "quote", "QueryBlocks", "set_Parameters", "resolveEnum", "AddClause", "ViewName", "set_Objects", "offset", "__unsafe_get", "__unsafe_set", "indexOf", "set_ConnectionPoolSize", "ADDFOREIGNKEY", "lookup", "set_Name", "fileName", "getFloat", "ParameterDirection", "CategoryName", "setInt64Value", "get_NewValue", "IsNotNull", "setStringValue", "set_Role", "set_Rows", "Task_SetComplete", "get_ServerPort", "toDynamic", "get_Schema", "NameModified", "DataType", "isNULL", "regex", "Source", "get_UserID", "get_Title", "TrackChanges", "ParameterName", "get_CategoryName", "DBType", "Category_Save", "readByte", "BlockCode", "set_Schema", "right", "set_ObjectEditType", "OrderBySentences", "set_OtherParameters", "DROPCONSTRAINT", "set_UserID", "get_NameModified", "canSeek", "addDouble", "getDefault", "CreatedAt", "get_FullName", "set_Value", "getMonth", "get_TrackChanges", "set_Password", "unwrap", "readMessage", "customParams", "ReferenceTable", "nextChar", "get_CurrentDeployEnvironment", "get_CategoryId", "readInt8", "get_ParameterName", "SaveInner", "get_InnerCondition", "addEvent", "Database", "set_BlockCode", "readLine", "ServerPort", "HAVING", "set_ParameterDirection", "BlockName", "doParse", "get_canSeek", "_height", "set_CurrentDeployEnvironment", "bitAND", "bitXOR", "Query", "Queue", "ObjectEditType", "ServiceName", "setFloatValue", "__get", "set_CreatedAt", "__set", "OldValue", "secureRandom", "COLUMNS", "__hx_deleteField", "ORDERBY", "Equals", "serialize", "Schema", "Module", "lineNumber", "UserID", "set_BlockName", "set_DatabaseTypeAuthentication", "isEMPTY", "getUTCHours", "CategoryId", "readUntil", "promise", "modulus", "upperBound", "unshift", "setUInt16", "set_NewValue", "getUTCFullYear", "SCRIPT_PART", "oneTimeEventsIdx", "SCRIPT", "UpdateSource", "ValuesType", "_keys", "set_ColumnIndex", "Person_Login", "unserialize", "PasswordHash", "get_DeploEnvironment", "Column", "addFloat", "shash", "shift", "Sentence", "matchedLeft", "set_Items", "addByte", "ReadTable", "addChar", "get_ColumnIndex", "removeMinBinding", "slice", "unserializeEnum", "get_PasswordHash", "set_Description"};
		
		protected static int length;
		
		public static void addFields(int[] nids, string[] nfields) {
			unchecked {
				int[] cids = global::haxe.lang.FieldLookup.fieldIds;
				string[] cfields = global::haxe.lang.FieldLookup.fields;
				int nlen = ( nids as global::System.Array ).Length;
				int clen = global::haxe.lang.FieldLookup.length;
				if (( ( nfields as global::System.Array ).Length != nlen )) {
					throw ((global::System.Exception) (global::haxe.Exception.thrown(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat(global::haxe.lang.Runtime.concat("Different fields length: ", global::haxe.lang.Runtime.toString(nlen)), " and "), global::haxe.lang.Runtime.toString(( nfields as global::System.Array ).Length)))) );
				}
				
				bool needsChange = false;
				{
					int[] _g_arr = nids;
					uint _g_idx = ((uint) (0) );
					while (( _g_idx < ( _g_arr as global::System.Array ).Length )) {
						_g_idx += ((uint) (1) );
						int i = _g_arr[((int) (((uint) (( _g_idx - 1 )) )) )];
						if (( global::haxe.lang.FieldLookup.findHash(i, cids, clen) < 0 )) {
							needsChange = true;
							break;
						}
						
					}
					
				}
				
				if (needsChange) {
					lock(typeof(global::haxe.lang.FieldLookup)){
						int[] ansIds = new int[( clen + nlen )];
						string[] ansFields = new string[( clen + nlen )];
						int ci = 0;
						int ni = 0;
						int ansi = 0;
						while (true) {
							if ( ! ((( (( ci < clen )) ? (( ni < nlen )) : (false) ))) ) {
								break;
							}
							
							if (( cids[ci] < nids[ni] )) {
								ansIds[ansi] = cids[ci];
								ansFields[ansi] = ((string) (cfields[ci]) );
								ci = ( ci + 1 );
							}
							else {
								ansIds[ansi] = nids[ni];
								ansFields[ansi] = ((string) (nfields[ni]) );
								ni = ( ni + 1 );
							}
							
							ansi = ( ansi + 1 );
						}
						
						if (( ci < clen )) {
							global::System.Array.Copy(((global::System.Array) (cids) ), ((int) (ci) ), ((global::System.Array) (ansIds) ), ((int) (ansi) ), ((int) (( clen - ci )) ));
							global::System.Array.Copy(((global::System.Array) (cfields) ), ((int) (ci) ), ((global::System.Array) (ansFields) ), ((int) (ansi) ), ((int) (( clen - ci )) ));
							ansi = ( ansi + (( clen - ci )) );
						}
						
						if (( ni < nlen )) {
							global::System.Array.Copy(((global::System.Array) (nids) ), ((int) (ni) ), ((global::System.Array) (ansIds) ), ((int) (ansi) ), ((int) (( nlen - ni )) ));
							global::System.Array.Copy(((global::System.Array) (nfields) ), ((int) (ni) ), ((global::System.Array) (ansFields) ), ((int) (ansi) ), ((int) (( nlen - ni )) ));
							ansi = ( ansi + (( nlen - ni )) );
						}
						
						global::haxe.lang.FieldLookup.fieldIds = ansIds;
						global::haxe.lang.FieldLookup.fields = ansFields;
						global::haxe.lang.FieldLookup.length = ansi;
					}
					;
				}
				
			}
		}
		
		
		public static int doHash(string s) {
			unchecked {
				int acc = 0;
				{
					int _g = 0;
					int _g1 = s.Length;
					while (( _g < _g1 )) {
						int i = _g++;
						acc = ( ( ( 223 * (( acc >> 1 )) ) + ((int) (s[i]) ) ) << 1 );
					}
					
				}
				
				return ((int) (( ((uint) (acc) ) >> 1 )) );
			}
		}
		
		
		public static string lookupHash(int key) {
			unchecked {
				int[] ids = global::haxe.lang.FieldLookup.fieldIds;
				int min = 0;
				int max = global::haxe.lang.FieldLookup.length;
				while (( min < max )) {
					int mid = ( min + ( (( max - min )) / 2 ) );
					int imid = ids[mid];
					if (( key < imid )) {
						max = mid;
					}
					else if (( key > imid )) {
						min = ( mid + 1 );
					}
					else {
						return ((string) (global::haxe.lang.FieldLookup.fields[mid]) );
					}
					
				}
				
				throw ((global::System.Exception) (global::haxe.Exception.thrown(global::haxe.lang.Runtime.concat("Field not found for hash ", global::haxe.lang.Runtime.toString(key)))) );
			}
		}
		
		
		public static int hash(string s) {
			unchecked {
				if (( s == null )) {
					return 0;
				}
				
				int acc = 0;
				{
					int _g = 0;
					int _g1 = s.Length;
					while (( _g < _g1 )) {
						int i = _g++;
						acc = ( ( ( 223 * (( acc >> 1 )) ) + ((int) (s[i]) ) ) << 1 );
					}
					
				}
				
				int key = ((int) (( ((uint) (acc) ) >> 1 )) );
				int[] ids = global::haxe.lang.FieldLookup.fieldIds;
				string[] fld = global::haxe.lang.FieldLookup.fields;
				int min = 0;
				int max = global::haxe.lang.FieldLookup.length;
				int len = global::haxe.lang.FieldLookup.length;
				while (( min < max )) {
					int mid = ((int) (( min + ( ((double) ((( max - min ))) ) / 2 ) )) );
					int imid = ids[mid];
					if (( key < imid )) {
						max = mid;
					}
					else if (( key > imid )) {
						min = ( mid + 1 );
					}
					else {
						string field = ((string) (fld[mid]) );
						if (( field != s )) {
							return  ~ (key) ;
						}
						
						return key;
					}
					
				}
				
				lock(typeof(global::haxe.lang.FieldLookup)){
					if (( len != global::haxe.lang.FieldLookup.length )) {
						return global::haxe.lang.FieldLookup.hash(s);
					}
					
					global::haxe.lang.FieldLookup.fieldIds = global::haxe.lang.FieldLookup.insertInt(global::haxe.lang.FieldLookup.fieldIds, global::haxe.lang.FieldLookup.length, min, key);
					global::haxe.lang.FieldLookup.fields = global::haxe.lang.FieldLookup.insertString(global::haxe.lang.FieldLookup.fields, global::haxe.lang.FieldLookup.length, min, s);
					 ++ global::haxe.lang.FieldLookup.length;
				}
				;
				return key;
			}
		}
		
		
		public static int findHash(int hash, int[] hashs, int length) {
			unchecked {
				int min = 0;
				int max = length;
				while (( min < max )) {
					int mid = ( (( max + min )) / 2 );
					int imid = hashs[mid];
					if (( hash < imid )) {
						max = mid;
					}
					else if (( hash > imid )) {
						min = ( mid + 1 );
					}
					else {
						return mid;
					}
					
				}
				
				return  ~ (min) ;
			}
		}
		
		
		public static void removeInt(int[] a, int length, int pos) {
			unchecked {
				global::System.Array.Copy(((global::System.Array) (a) ), ((int) (( pos + 1 )) ), ((global::System.Array) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
				a[( length - 1 )] = 0;
			}
		}
		
		
		public static void removeFloat(double[] a, int length, int pos) {
			unchecked {
				global::System.Array.Copy(((global::System.Array) (a) ), ((int) (( pos + 1 )) ), ((global::System.Array) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
				a[( length - 1 )] = ((double) (0) );
			}
		}
		
		
		public static void removeDynamic(object[] a, int length, int pos) {
			unchecked {
				global::System.Array.Copy(((global::System.Array) (a) ), ((int) (( pos + 1 )) ), ((global::System.Array) (a) ), ((int) (pos) ), ((int) (( ( length - pos ) - 1 )) ));
				a[( length - 1 )] = null;
			}
		}
		
		
		public static int[] insertInt(int[] a, int length, int pos, int x) {
			unchecked {
				int[] a1 = a;
				int capacity = ( a1 as global::System.Array ).Length;
				if (( pos == length )) {
					if (( capacity == length )) {
						int[] newarr = new int[( (( length << 1 )) + 1 )];
						( a1 as global::System.Array ).CopyTo(((global::System.Array) (newarr) ), ((int) (0) ));
						a1 = newarr;
					}
					
				}
				else if (( pos == 0 )) {
					if (( capacity == length )) {
						int[] newarr1 = new int[( (( length << 1 )) + 1 )];
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr1) ), ((int) (1) ), ((int) (length) ));
						a1 = newarr1;
					}
					else {
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else if (( capacity == length )) {
					int[] newarr2 = new int[( (( length << 1 )) + 1 )];
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr2) ), ((int) (0) ), ((int) (pos) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					a1 = newarr2;
				}
				else {
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (0) ), ((int) (pos) ));
				}
				
				a1[pos] = x;
				return a1;
			}
		}
		
		
		public static double[] insertFloat(double[] a, int length, int pos, double x) {
			unchecked {
				double[] a1 = a;
				int capacity = ( a1 as global::System.Array ).Length;
				if (( pos == length )) {
					if (( capacity == length )) {
						double[] newarr = new double[( (( length << 1 )) + 1 )];
						( a1 as global::System.Array ).CopyTo(((global::System.Array) (newarr) ), ((int) (0) ));
						a1 = newarr;
					}
					
				}
				else if (( pos == 0 )) {
					if (( capacity == length )) {
						double[] newarr1 = new double[( (( length << 1 )) + 1 )];
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr1) ), ((int) (1) ), ((int) (length) ));
						a1 = newarr1;
					}
					else {
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else if (( capacity == length )) {
					double[] newarr2 = new double[( (( length << 1 )) + 1 )];
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr2) ), ((int) (0) ), ((int) (pos) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					a1 = newarr2;
				}
				else {
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (0) ), ((int) (pos) ));
				}
				
				a1[pos] = x;
				return a1;
			}
		}
		
		
		public static object[] insertDynamic(object[] a, int length, int pos, object x) {
			unchecked {
				object[] a1 = a;
				int capacity = ( a1 as global::System.Array ).Length;
				if (( pos == length )) {
					if (( capacity == length )) {
						object[] newarr = new object[( (( length << 1 )) + 1 )];
						( a1 as global::System.Array ).CopyTo(((global::System.Array) (newarr) ), ((int) (0) ));
						a1 = newarr;
					}
					
				}
				else if (( pos == 0 )) {
					if (( capacity == length )) {
						object[] newarr1 = new object[( (( length << 1 )) + 1 )];
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr1) ), ((int) (1) ), ((int) (length) ));
						a1 = newarr1;
					}
					else {
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else if (( capacity == length )) {
					object[] newarr2 = new object[( (( length << 1 )) + 1 )];
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr2) ), ((int) (0) ), ((int) (pos) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					a1 = newarr2;
				}
				else {
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (0) ), ((int) (pos) ));
				}
				
				a1[pos] = ((object) (x) );
				return a1;
			}
		}
		
		
		public static string[] insertString(string[] a, int length, int pos, string x) {
			unchecked {
				string[] a1 = a;
				int capacity = ( a1 as global::System.Array ).Length;
				if (( pos == length )) {
					if (( capacity == length )) {
						string[] newarr = new string[( (( length << 1 )) + 1 )];
						( a1 as global::System.Array ).CopyTo(((global::System.Array) (newarr) ), ((int) (0) ));
						a1 = newarr;
					}
					
				}
				else if (( pos == 0 )) {
					if (( capacity == length )) {
						string[] newarr1 = new string[( (( length << 1 )) + 1 )];
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr1) ), ((int) (1) ), ((int) (length) ));
						a1 = newarr1;
					}
					else {
						global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (1) ), ((int) (length) ));
					}
					
				}
				else if (( capacity == length )) {
					string[] newarr2 = new string[( (( length << 1 )) + 1 )];
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (newarr2) ), ((int) (0) ), ((int) (pos) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (newarr2) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					a1 = newarr2;
				}
				else {
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (pos) ), ((global::System.Array) (a1) ), ((int) (( pos + 1 )) ), ((int) (( length - pos )) ));
					global::System.Array.Copy(((global::System.Array) (a1) ), ((int) (0) ), ((global::System.Array) (a1) ), ((int) (0) ), ((int) (pos) ));
				}
				
				a1[pos] = x;
				return a1;
			}
		}
		
		
		public static global::haxe.lang.FieldHashConflict getHashConflict(global::haxe.lang.FieldHashConflict head, int hash, string name) {
			while (( head != null )) {
				if (( ( head.hash == hash ) && ( head.name == name ) )) {
					return head;
				}
				
				head = head.next;
			}
			
			return null;
		}
		
		
		public static void setHashConflict(ref global::haxe.lang.FieldHashConflict head, int hash, string name, object @value) {
			global::haxe.lang.FieldHashConflict node = head;
			while (( node != null )) {
				if (( ( node.hash == hash ) && ( node.name == name ) )) {
					node.@value = @value;
					return;
				}
				
				node = ((global::haxe.lang.FieldHashConflict) (node.next) );
			}
			
			head = ((global::haxe.lang.FieldHashConflict) (new global::haxe.lang.FieldHashConflict(hash, name, @value, ((global::haxe.lang.FieldHashConflict) (head) ))) );
		}
		
		
		public static bool deleteHashConflict(ref global::haxe.lang.FieldHashConflict head, int hash, string name) {
			if (( head == null )) {
				return false;
			}
			
			if (( ( head.hash == hash ) && ( head.name == name ) )) {
				head = ((global::haxe.lang.FieldHashConflict) (head.next) );
				return true;
			}
			
			global::haxe.lang.FieldHashConflict prev = head;
			global::haxe.lang.FieldHashConflict node = head.next;
			while (( node != null )) {
				if (( ( node.hash == hash ) && ( node.name == name ) )) {
					prev.next = node.next;
					return true;
				}
				
				node = node.next;
			}
			
			return false;
		}
		
		
		public static void addHashConflictNames(global::haxe.lang.FieldHashConflict head, global::Array<string> arr) {
			while (( head != null )) {
				arr.push(head.name);
				head = head.next;
			}
			
		}
		
		
	}
}


