using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using nMorph.framework.orm;
using System.Data.Common;
using nMorph.framework.orm.client;
using System.Reflection;

using System.Data.SqlClient;
using nMorph.framework.orm.configuration;
using System.Collections;
using System.Transactions;
//using MySql.Data.MySqlClient;
//using Npgsql;
//using Oracle.DataAccess.Client;

#pragma warning disable 109, 114, 219, 429, 168, 162
namespace nMorph.framework.orm.client
{
    public class Connector : global::haxe.lang.HxObject
    {

        static Connector()
        {
            global::nMorph.framework.orm.client.Connector.__rtti = "<class path=\"nMorph.framework.orm.client.Connector\" params=\"\">\n\t<Execute public=\"1\" set=\"method\" line=\"9\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></Execute>\n\t<Queue public=\"1\" set=\"method\" line=\"14\" static=\"1\"><f a=\"SQL:Parameters:queue\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n</f></Queue>\n\t<ExecuteQueue public=\"1\" set=\"method\" line=\"29\" static=\"1\"><f a=\"queue\">\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueueItem\"/></c>\n\t<x path=\"Void\"/>\n</f></ExecuteQueue>\n\t<ReadValue public=\"1\" set=\"method\" line=\"37\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<d/>\n</f></ReadValue>\n\t<ReadTable public=\"1\" set=\"method\" line=\"42\" static=\"1\"><f a=\"SQL:Parameters\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<c path=\"nMorph.framework.orm.client.QueryTable\"/>\n</f></ReadTable>\n\t<Read public=\"1\" params=\"T\" set=\"method\" line=\"48\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"Read.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"Array\"><c path=\"Read.T\"/></c>\n</f></Read>\n\t<ReadOne public=\"1\" params=\"T\" set=\"method\" line=\"54\" static=\"1\"><f a=\"SQL:Parameters:cl:?context\">\n\t<c path=\"String\"/>\n\t<c path=\"Array\"><c path=\"nMorph.framework.orm.client.QueryParameter\"/></c>\n\t<x path=\"Class\"><c path=\"ReadOne.T\"/></x>\n\t<c path=\"nMorph.framework.orm.tools.Context\"/>\n\t<c path=\"ReadOne.T\"/>\n</f></ReadOne>\n\t<meta>\n\t\t<m n=\":directlyUsed\"/>\n\t\t<m n=\":hxGen\"/>\n\t\t<m n=\":keepSub\"/>\n\t\t<m n=\":rtti\"/>\n\t</meta>\n</class>";
        }

        public Connector(global::haxe.lang.EmptyObject empty)
        {
        }

        public Connector()
        {
            global::nMorph.framework.orm.client.Connector.__hx_ctor_sw_framework_orm_client_Connector(this);
        }

        protected static void __hx_ctor_sw_framework_orm_client_Connector(global::nMorph.framework.orm.client.Connector __hx_this)
        {
        }

        public static string __rtti;


        public static object Execute(string SQLQuery, global::Array<object> Parameters, global::nMorph.framework.orm.tools.Context context = null)
        {
            return Run<object>(SQLQuery, Parameters, OperationEnum.NonQuery, typeof(string), context);
        }

        public static global::Array<object> Queue(string SQLQuery, global::Array<object> Parameters, global::Array<object> queue)
        {
            if ((queue == null))
            {
                queue = new global::Array<object>();
            }

            global::nMorph.framework.orm.client.QueueItem item = new global::nMorph.framework.orm.client.QueueItem();
            item.set_SQL(SQLQuery);
            item.set_Parameters(Parameters);
            queue.push(item);
            return queue;
        }

        public static void ExecuteQueue(global::Array<object> queue)
        {
            int paramNumber = 0;
            StringBuilder sb = new StringBuilder();
            Array<object> globalParams = new Array<object>();

            using (TransactionScope scope = new TransactionScope(TransactionScopeOption.Required))
            {
                // itera por todos los elementos de la cola de querys a ejecutar
                for (int i = 0; i < queue.length; i++)
                {
                    global::nMorph.framework.orm.client.QueueItem item = ((global::nMorph.framework.orm.client.QueueItem)(queue[i]));

                    //global::nMorph.framework.orm.client.Connector.Execute(item.get_SQL(), item.get_Parameters());

                    // Concatena los querys separados por punto y coma, para que se corran en una sola transacción
                    sb.AppendLine(item.get_SQL() + ";");

                    // Se agregan los parámetros a un listado global para que puedan ser ejecutados
                    globalParams = globalParams.concat(item.get_Parameters());

                    // Si este es el último, ejecuta
                    if (i == queue.length - 1)
                    {
                        global::nMorph.framework.orm.client.Connector.Execute(sb.ToString(), globalParams);
						break;
                    }

                    // Si con el número de parámetros del siguiente se supera los 2099 parámetros (máx permitido)
                    // se ejecuta el bloque, limpia para siguiente vuelta
                    if (((global::nMorph.framework.orm.client.QueueItem)(queue[i + 1])).get_Parameters().length + globalParams.length > 2099)
                    {
                        global::nMorph.framework.orm.client.Connector.Execute(sb.ToString(), globalParams);
                        sb.Clear();
                        globalParams = new Array<object>();
                    }
                }

                scope.Complete();
            }
        }

        public static object ReadValue(string SQLQuery, global::Array<object> Parameters, global::nMorph.framework.orm.tools.Context context = null)
        {
            return Run<object>(SQLQuery, Parameters, OperationEnum.Scalar, typeof(string), context);
        }

        public static global::nMorph.framework.orm.client.QueryTable ReadTable(string SQLQuery, global::Array<object> Parameters, global::nMorph.framework.orm.tools.Context context = null)
        {
            return (global::nMorph.framework.orm.client.QueryTable)Run<object>(SQLQuery, Parameters, OperationEnum.QueryTable, typeof(QueryTable), context);
        }

        public static global::Array<T> Read<T>(string SQLQuery, global::Array<object> Parameters, global::System.Type cl, global::nMorph.framework.orm.tools.Context context = null)
        {
            return (global::Array<T>)Run<object>(SQLQuery, Parameters, OperationEnum.ObjectArray, cl, context);
        }

        public static T ReadOne<T>(string SQLQuery, global::Array<object> Parameters, global::System.Type cl, global::nMorph.framework.orm.tools.Context context = null)
        {
            T obj = (T)Run<T>(SQLQuery, Parameters, OperationEnum.SingleObject, cl, context);
            if (obj is global::nMorph.framework.orm.client.ModelObject)
            {
                global::nMorph.framework.orm.client.ModelObject mo = (global::nMorph.framework.orm.client.ModelObject)(object)obj;
                mo.ObjectEditType = nMorph.framework.orm.common.enums.ObjectEditTypeEnum.NOCHANGE;

                mo.ObjectSource = nMorph.framework.orm.common.enums.ObjectSourceTypeEnum.DB;
                if (context != null)
                {
                    context.Objects.push(obj);
                    mo.TrackChanges = true;
                }
                else
                {
                    mo.TrackChanges = false;
                }
            }
            return obj;
        }

        private static object Run<T>(string SQLQuery, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl, global::nMorph.framework.orm.tools.Context context = null)
        {
            object Result = null;
            unchecked
            {
                global::nMorph.framework.orm.configuration.DatabaseConnectionData ConnectionData = global::nMorph.framework.orm.configuration.Configuration.Data.get_CurrentDatabaseConnection();
                global::nMorph.framework.orm.configuration.DatabaseEngineEnum _dataBase = ConnectionData.get_DatabaseEngine();

                switch (_dataBase._hx_index)
                {

                    case 2: // MYSQL
                        {
                            //Connector conection = new Connector();
                            //Result = conection.RunMysql<object>(ConnectionData, SQL, Parameters, operation, cl);
                            break;
                        }


                    case 1: // ORACLE
                        {
                            //Connector conection = new Connector();
                            //Result = conection.RunOracle<object>(ConnectionData, SQL, Parameters, operation, cl);
                            break;
                        }


                    case 3: //POSTGRES
                        {
                            //Connector conection = new Connector();
                            //Result = conection.RunPosgres<object>(ConnectionData, SQL, Parameters, operation, cl);
                            break;
                        }

                    default: // GENERIC, ODBC          
                    case 0: // SQL SERVER
                        {
                            Connector conection = new Connector();
                            Result = conection.RunSqlServer(ConnectionData, SQLQuery, Parameters, operation, cl, context);
                            break;
                        }
                }

            }
            return Result;
        }

        //     public object RunOracle<T>(DatabaseConnectionData connectionData, string SQL, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl)
        //     {
        //         object Result = null;
        //         int numParam = Parameters.length;
        //         for (int i = 1; i <= numParam; i++)
        //         {
        //             SQL = SQL.Replace("@P" + i, ":P" + i);
        //         }

        //// NO DEBERÍA EXISTIR
        //         //Traslate query
        //         //SQL = decodeQuery(SQL);

        //         unchecked
        //         {

        //             ConectarORACLEServer conn = new ConectarORACLEServer();
        //             OracleConnection con = conn.conectar(connectionData.get_ConnectionString(), connectionData.get_ServerPort(), connectionData.get_Database(), connectionData.get_UserID(), connectionData.get_Password());

        //             using (OracleCommand command = new OracleCommand(SQL, con))
        //             {
        //                 Array<OracleParameter> parameters = new Array<OracleParameter>();
        //                 if (Parameters != null & numParam > 0)
        //                 {
        //                     //cast parameters to sql parameters
        //                     parameters = parametersOracle(Parameters);
        //                 }
        //                 int countParmeters = parameters.length;
        //                 int countActual = 0;
        //                 while (countActual < countParmeters)
        //                 {
        //                     command.Parameters.Add(parameters[countActual]);
        //                     countActual++;
        //                 }

        //                 switch (operation)
        //                 {
        //                     case OperationEnum.NonQuery:
        //                         Result = command.ExecuteNonQuery();
        //                         break;
        //                     case OperationEnum.Scalar:
        //                         Result = command.ExecuteScalar();
        //                         break;
        //                     case OperationEnum.QueryTable:
        //                         var search = command.ExecuteReader();
        //                         Result = ConvertToHaxeQueryTableOracle(search);
        //                         break;

        //                     case OperationEnum.ObjectArray:

        //                         OracleDataReader reader = command.ExecuteReader();
        //                         Array<T> array = new Array<T>();
        //                         global::Array<object> _g2 = Fields(cl);

        //                         if (reader.HasRows)
        //                         {
        //                             while (reader.Read())
        //                             {
        //                                 T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));
        //                                 // mapeo al objeto
        //                                 int _g1 = 0;
        //                                 while ((_g1 < _g2.length))
        //                                 {
        //                                     string field = global::haxe.lang.Runtime.toString(_g2[_g1]);
        //                                     ++_g1;
        //                                     try { 
        //                                         object value = reader.GetValue(reader.GetOrdinal(field));
        //                                         object valueCast = null;
        //                                         value.GetType();
        //                                         if (value == DBNull.Value)
        //                                             valueCast = null;
        //                                         else
        //                                         {
        //                                             if (value.GetType() == typeof(System.DateTime))
        //                                             {
        //                                                 string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                                 global::Date fvalue = global::Date.fromString(fString);
        //                                                 valueCast = fvalue;
        //                                             }
        //                                             else
        //                                             {
        //                                                 if (value.GetType() == typeof(System.SByte))
        //                                                 {
        //                                                     bool result = Convert.ToBoolean(value);
        //                                                     valueCast = result;
        //                                                 }
        //                                                 else
        //                                                 {
        //                                                     if (value.GetType() == typeof(System.Byte[]))
        //                                                     {
        //                                                         System.Byte[] blobByte = (System.Byte[])value;
        //                                                         haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                         valueCast = haxeblob;
        //                                                     }
        //                                                     else
        //                                                     {
        //                                                         valueCast=value;
        //                                                     }
        //                                                 }
        //                                             }
        //                                         }										
        //							    global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                     }
        //                                     catch (System.Exception e)
        //                                     {
        //                                         //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                     }

        //                                 }
        //                                 array.push(item);
        //                             }
        //                         }
        //                         Result = array;
        //                         break;

        //                     case OperationEnum.SingleObject:

        //                         OracleDataReader reader1 = command.ExecuteReader();

        //                         global::Array<object> _g3 = Fields(cl);

        //                         if (reader1.HasRows)
        //                         {
        //                             while (reader1.Read())
        //                             {
        //                                 T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                                 // mapeo al objeto
        //                                 int _g1 = 0;

        //                                 while ((_g1 < _g3.length))
        //                                 {
        //                                     string field = global::haxe.lang.Runtime.toString(_g3[_g1]);
        //                                     ++_g1;
        //                                     try { 
        //                                         object value = reader1.GetValue(reader1.GetOrdinal(field));
        //                                         object valueCast = null;
        //                                         if (value == DBNull.Value)
        //                                             valueCast = null;
        //                                         else
        //                                         {
        //                                             if (value.GetType() == typeof(System.DateTime))
        //                                             {
        //                                                 string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                                 global::Date fvalue = global::Date.fromString(fString);
        //                                                 valueCast = fvalue;
        //                                             }
        //                                             else
        //                                             {
        //                                                 if (value.GetType() == typeof(System.SByte))
        //                                                 {
        //                                                     bool result = Convert.ToBoolean(value);
        //                                                     valueCast = result;
        //                                                 }
        //                                                 else
        //                                                 {
        //                                                     if (value.GetType() == typeof(System.Byte[]))
        //                                                     {
        //                                                         System.Byte[] blobByte = (System.Byte[])value;
        //                                                         haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                         valueCast = haxeblob;
        //                                                     }
        //                                                     else
        //                                                     {
        //                                                         valueCast = value;
        //                                                     }
        //                                                 }
        //                                             }
        //                                         }
        //                                         global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                     }
        //                                     catch (System.Exception e)
        //                                     {
        //                                         //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                     }
        //                                 }

        //                                 return item;

        //                             }
        //                         }
        //                         return null;
        //                 }
        //                 conn.cerrarConeccion(con);
        //             }
        //         }
        //         return Result;
        //     }

        //public object Run<T>(DatabaseConnectionData connectionData, string SQL, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl)
        //{
        //    object Result = null;
        //    unchecked
        //    {

        //        ConectarORACLEServer conn = new ConectarORACLEServer();
        //        OracleConnection con = conn.conectar(connectionData.get_ConnectionString(), connectionData.get_ServerPort(), connectionData.get_Database(), connectionData.get_UserID(), connectionData.get_Password());

        //        using (OracleCommand command = new OracleCommand(SQL, con))
        //        {
        //            Array<OracleParameter> parameters = new Array<OracleParameter>();
        //            if (Parameters != null)
        //            {
        //                //cast parameters to sql parameters
        //                parameters = parametersOracle(Parameters);
        //            }
        //            int countParmeters = parameters.length;
        //            int countActual = 0;
        //            while (countActual < countParmeters)
        //            {
        //                command.Parameters.Add(parameters[countActual]);
        //                countActual++;
        //            }

        //            switch (operation)
        //            {
        //                case OperationEnum.NonQuery:
        //                    Result = command.ExecuteNonQuery();
        //                    break;
        //                case OperationEnum.Scalar:
        //                    Result = command.ExecuteScalar();
        //                    break;
        //                case OperationEnum.QueryTable:
        //                    var search = command.ExecuteReader();
        //                    Result = ConvertToHaxeQueryTableOracle(search);
        //                    break;

        //                case OperationEnum.ObjectArray:

        //                    OracleDataReader reader = command.ExecuteReader();
        //                    Array<T> array = new Array<T>();
        //                    global::Array<object> _g2 = Fields(cl);

        //                    if (reader.HasRows)
        //                    {
        //                        while (reader.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));
        //                            // mapeo al objeto
        //                            int _g1 = 0;
        //                            while ((_g1 < _g2.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g2[_g1]);
        //                                ++_g1;
        //                                object value = reader.GetValue(reader.GetOrdinal(field));

        //                                if (value == DBNull.Value)
        //                                    value = null;

        //                                global::Reflect.setField(item, field, value);//campo guardar,nombre del campo, y valor del campo
        //                                //global::Reflect.setField(item, field, reader.GetValue(reader.GetOrdinal(field)));
        //                            }
        //                            array.push(item);
        //                        }
        //                    }
        //                    Result = array;
        //                    break;

        //                case OperationEnum.SingleObject:

        //                    OracleDataReader reader1 = command.ExecuteReader();

        //                    global::Array<object> _g3 = Fields(cl);

        //                    if (reader1.HasRows)
        //                    {
        //                        while (reader1.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                            // mapeo al objeto
        //                            int _g1 = 0;

        //                            while ((_g1 < _g3.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g3[_g1]);
        //                                ++_g1;
        //                                object value = reader1.GetValue(reader1.GetOrdinal(field));

        //                                if (value == DBNull.Value)
        //                                    value = null;

        //                                global::Reflect.setField(item, field, value);//campo guardar,nombre del campo, y valor del campo
        //                                //global::Reflect.setField(item, field, reader1.GetValue(reader1.GetOrdinal(field)));
        //                            }

        //                            return item;

        //                        }
        //                    }
        //                    return null;
        //            }
        //            conn.cerrarConeccion(con);
        //        }
        //    }
        //    return Result;
        //}

        //public object RunPosgres<T>(DatabaseConnectionData connectionData, string SQL, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl)
        //{
        //    object Result = null;
        //    int numParam = Parameters.length;
        //    for (int i = 1; i <= numParam; i++)
        //    {
        //        SQL = SQL.Replace(":P" + i, "@P" + i);
        //    }

        //    //Traslate query
        //    //SQL = decodeQuery(SQL);

        //    unchecked
        //    {

        //        ConectarPOSTGRESServer conn = new ConectarPOSTGRESServer();
        //        NpgsqlConnection con = conn.conectar(connectionData.get_ConnectionString(), connectionData.get_ServerPort(), connectionData.get_Database(), connectionData.get_UserID(), connectionData.get_Password());

        //        using (NpgsqlCommand command = new NpgsqlCommand(SQL, con))
        //        {
        //            Array<NpgsqlParameter> parameters = new Array<NpgsqlParameter>();
        //            if (Parameters != null & numParam > 0)
        //            {
        //                //cast parameters to sql parameters
        //                parameters = parametersPOSTGRES(Parameters);
        //            }
        //            int countParmeters = parameters.length;
        //            int countActual = 0;
        //            while (countActual < countParmeters)
        //            {
        //                command.Parameters.Add(parameters[countActual]);
        //                countActual++;
        //            }

        //            switch (operation)
        //            {
        //                case OperationEnum.NonQuery:
        //                    Result = command.ExecuteNonQuery();
        //                    break;
        //                case OperationEnum.Scalar:
        //                    Result = command.ExecuteScalar();
        //                    break;
        //                case OperationEnum.QueryTable:
        //                    var search = command.ExecuteReader();
        //                    Result = ConvertToHaxeQueryTablePostgres(search);
        //                    break;

        //                case OperationEnum.ObjectArray:

        //                    NpgsqlDataReader reader = command.ExecuteReader();
        //                    Array<T> array = new Array<T>();
        //                    global::Array<object> _g2 = Fields(cl);

        //                    if (reader.HasRows)
        //                    {
        //                        while (reader.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                            // mapeo al objeto
        //                            int _g1 = 0;

        //                            while ((_g1 < _g2.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g2[_g1]);
        //                                ++_g1;
        //                                try {
        //                                    object value = reader.GetValue(reader.GetOrdinal(field));
        //                                    object valueCast = null;
        //                                    if (value == DBNull.Value)
        //                                        valueCast = null;
        //                                    else
        //                                    {
        //                                        if (value.GetType() == typeof(System.DateTime))
        //                                        {
        //                                            string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                            global::Date fvalue = global::Date.fromString(fString);
        //                                            valueCast = fvalue;
        //                                        }
        //                                        else
        //                                        {
        //                                            if (value.GetType() == typeof(System.SByte))
        //                                            {
        //                                                bool result = Convert.ToBoolean(value);
        //                                                valueCast = result;
        //                                            }
        //                                            else
        //                                            {
        //                                                if (value.GetType() == typeof(System.Byte[]))
        //                                                {
        //                                                    System.Byte[] blobByte = (System.Byte[])value;
        //                                                    BitConverter.ToString(blobByte);
        //                                                    // Convert the array to a base 64 sring.
        //                                                    //String s = Convert.ToBase64String(blobByte);
        //                                                    // Restore the byte array.
        //                                                    //byte[] newBytes = Convert.FromBase64String(s);
        //                                                    //BitConverter.ToString(newBytes);
        //                                                    haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                    valueCast = haxeblob;
        //                                                }
        //                                                else
        //                                                {
        //                                                    valueCast = value;
        //                                                }
        //                                            }
        //                                        }
        //                                    }
        //                                    global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                }
        //                                catch (System.Exception e)
        //                                {
        //                                    //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                }
        //                            }

        //                            array.push(item);
        //                        }
        //                    }

        //                    Result = array;

        //                    break;

        //                case OperationEnum.SingleObject:

        //                    NpgsqlDataReader reader1 = command.ExecuteReader();

        //                    global::Array<object> _g3 = Fields(cl);

        //                    if (reader1.HasRows)
        //                    {
        //                        while (reader1.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                            // mapeo al objeto
        //                            int _g1 = 0;

        //                            while ((_g1 < _g3.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g3[_g1]);
        //                                ++_g1;
        //                                try
        //                                {
        //                                    object value = reader1.GetValue(reader1.GetOrdinal(field));
        //                                    object valueCast = null;
        //                                    if (value == DBNull.Value)
        //                                        valueCast = null;
        //                                    else
        //                                    {
        //                                        if (value.GetType() == typeof(System.DateTime))
        //                                        {
        //                                            string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                            global::Date fvalue = global::Date.fromString(fString);
        //                                            valueCast = fvalue;
        //                                        }
        //                                        else
        //                                        {
        //                                            if (value.GetType() == typeof(System.SByte))
        //                                            {
        //                                                bool result = Convert.ToBoolean(value);
        //                                                valueCast = result;
        //                                            }
        //                                            else
        //                                            {
        //                                                if (value.GetType() == typeof(System.Byte[]))
        //                                                {
        //                                                    System.Byte[] blobByte = (System.Byte[])value;
        //                                                    haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                    valueCast = haxeblob;
        //                                                }
        //                                                else
        //                                                {
        //                                                    if (value.GetType() == typeof(System.Byte[]))
        //                                                    {
        //                                                        System.Byte[] blobByte = (System.Byte[])value;
        //                                                        BitConverter.ToString(blobByte);
        //                                                        // Convert the array to a base 64 sring.
        //                                                        //String s = Convert.ToBase64String(blobByte);
        //                                                        // Restore the byte array.
        //                                                        //byte[] newBytes = Convert.FromBase64String(s);
        //                                                        //BitConverter.ToString(newBytes);
        //                                                        haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                        valueCast = haxeblob;
        //                                                    }
        //                                                    else
        //                                                    {
        //                                                        valueCast = value;
        //                                                    }
        //                                                }
        //                                            }
        //                                        }
        //                                    }
        //                                    global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                }
        //                                catch (System.Exception e)
        //                                {
        //                                    //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                }
        //                            }

        //                            return item;

        //                        }
        //                    }
        //                    return null;
        //            }
        //            conn.cerrarConeccion(con);
        //        }
        //    }
        //    return Result;
        //}

        //public object RunMysql<T>(DatabaseConnectionData connectionData, string SQL, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl)
        //{
        //    object Result = null;
        //    SQL = SQL.Replace("\"","");
        //    int numParam = Parameters.length;
        //    for (int i = 1; i <= numParam; i++)
        //    {
        //        SQL = SQL.Replace(":P" + i, "@P"+i);
        //    }

        //    unchecked
        //    {

        //        ConectarMYSQLServer conn = new ConectarMYSQLServer();
        //        MySqlConnection con = conn.conectar(connectionData.get_ConnectionString(), connectionData.get_ServerPort(), connectionData.get_Database(), connectionData.get_UserID(), connectionData.get_Password());

        //        using (MySqlCommand command = new MySqlCommand(SQL, con))
        //        {
        //            Array<MySqlParameter> parameters = new Array<MySqlParameter>();
        //            if (Parameters != null & numParam >0)
        //            {
        //                //cast parameters to sql parameters
        //                parameters = parametersMYSQL(Parameters);
        //            }
        //            int countParmeters = parameters.length;
        //            int countActual = 0;
        //            while (countActual < countParmeters)
        //            {
        //                command.Parameters.Add(parameters[countActual]);
        //                countActual++;
        //            }

        //            switch (operation)
        //            {
        //                case OperationEnum.NonQuery:
        //                    Result = command.ExecuteNonQuery();
        //                    break;
        //                case OperationEnum.Scalar:
        //                    Result = command.ExecuteScalar();
        //                    break;
        //                case OperationEnum.QueryTable:
        //                    var search = command.ExecuteReader();
        //                    Result = ConvertToHaxeQueryTableMysql(search);
        //                    break;

        //                case OperationEnum.ObjectArray:

        //                    MySqlDataReader reader = command.ExecuteReader();
        //                    Array<T> array = new Array<T>();
        //                    global::Array<object> _g2 = Fields(cl);

        //                    if (reader.HasRows)
        //                    {
        //                        while (reader.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                            // mapeo al objeto
        //                            int _g1 = 0;
        //	string clase;
        //                            while ((_g1 < _g2.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g2[_g1]);
        //                                ++_g1;
        //                                try { 
        //                                    object value = reader.GetValue(reader.GetOrdinal(field));
        //                                    object valueCast = null;
        //                                    if (value == DBNull.Value)
        //                                        valueCast = null;
        //                                    else
        //                                    {
        //                                        if (value.GetType() == typeof(System.DateTime))
        //                                        {
        //                                            string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                            global::Date fvalue = global::Date.fromString(fString);
        //                                            valueCast = fvalue;
        //                                        }
        //                                        else
        //                                        {
        //                                            if (value.GetType() == typeof(System.SByte))
        //                                            {
        //                                                bool result= Convert.ToBoolean(value);
        //                                                valueCast = result;
        //                                            }
        //                                            else
        //                                            {
        //                                                if (value.GetType() == typeof(System.Byte[]))
        //                                                {
        //                                                    System.Byte[] blobByte = (System.Byte[])value;
        //                                                    haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                    valueCast = haxeblob;
        //                                                }
        //                                                else
        //                                                {
        //                                                    valueCast = value;
        //                                                }
        //                                            }
        //                                        }
        //                                    }
        //                                    global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                }
        //                                catch (System.Exception e)
        //                                {
        //                                    //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                }
        //                            }

        //                            array.push(item);
        //                        }
        //                    }

        //                    Result = array;

        //                    break;

        //                case OperationEnum.SingleObject:

        //                    MySqlDataReader reader1 = command.ExecuteReader();

        //                    global::Array<object> _g3 = Fields(cl);

        //                    if (reader1.HasRows)
        //                    {
        //                        while (reader1.Read())
        //                        {
        //                            T item = global::Type.createInstance<T>(cl, new global::Array<object>(new object[] { }));

        //                            // mapeo al objeto
        //                            int _g1 = 0;

        //                            while ((_g1 < _g3.length))
        //                            {
        //                                string field = global::haxe.lang.Runtime.toString(_g3[_g1]);
        //                                ++_g1;
        //                                try { 
        //                                    object value = reader1.GetValue(reader1.GetOrdinal(field));
        //                                    object valueCast = null;
        //                                    if (value == DBNull.Value)
        //                                        valueCast = null;
        //                                    else
        //                                    {
        //                                        if (value.GetType() == typeof(System.DateTime))
        //                                        {
        //                                            string fString = String.Format("{0:yyyy-MM-dd HH:mm:ss}", value);
        //                                            global::Date fvalue = global::Date.fromString(fString);
        //                                            valueCast = fvalue;
        //                                        }
        //                                        else
        //                                        {
        //                                            if (value.GetType() == typeof(System.SByte))
        //                                            {
        //                                                bool result = Convert.ToBoolean(value);
        //                                                valueCast = result;
        //                                            }
        //                                            else
        //                                            {
        //                                                if (value.GetType() == typeof(System.Byte[]))
        //                                                {
        //                                                    System.Byte[] blobByte = (System.Byte[])value;
        //                                                    haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
        //                                                    valueCast = haxeblob;
        //                                                }
        //                                                else
        //                                                {
        //                                                    valueCast = value;
        //                                                }
        //                                            }
        //                                        }
        //                                    }
        //                                    global::Reflect.setField(item, field, valueCast);//campo guardar,nombre del campo, y valor del campo
        //                                }
        //                                catch (System.Exception e)
        //                                {
        //                                    //Excepcion Provocada cuando la clase tiene mas elementos que el resultado de la consulta
        //                                }
        //                            }

        //                            return item;

        //                        }
        //                    }
        //                    return null;
        //            }
        //            conn.cerrarConeccion(con);
        //        }
        //    }
        //    return Result;
        //}

        public object RunSqlServer(DatabaseConnectionData connectionData, string SQLQuery, global::Array<object> Parameters, OperationEnum operation, global::System.Type cl, global::nMorph.framework.orm.tools.Context context = null)
        {
            object Result = null;
            int numParam = Parameters.length;
            for (int i = 1; i <= numParam; i++)
            {
                SQLQuery = SQLQuery.Replace(":P" + i, "@P" + i);
            }
            unchecked
            {
                // Armado de la cadena de conexión
                string connectionString =
                    "Data Source=" + connectionData.get_ConnectionString() + "," + connectionData.get_ServerPort() +
                    ";Initial Catalog=" + connectionData.get_Database() +
                    (connectionData.get_DatabaseTypeAuthentication() == DatabaseTypeAuthenticationEnum.WIN_AUTENTICATION ?
                        (";Integrated Security=true") :
                        (";User ID=" + connectionData.get_UserID() + ";Password=" + connectionData.get_Password())
                    );
                using (SqlConnection conn = new SqlConnection(connectionString))
                {
                    using (SqlCommand command = new SqlCommand(SQLQuery, conn))
                    {
                        Array<SqlParameter> parameters = new Array<SqlParameter>();
                        if (Parameters != null & numParam > 0)
                        {
                            //cast parameters to sql parameters
                            parameters = parametersSQL(Parameters);
                        }
                        int countParmeters = parameters.length;
                        int countActual = 0;
                        while (countActual < countParmeters)
                        {
                            command.Parameters.Add(parameters[countActual]);
                            countActual++;
                        }

                        switch (operation)
                        {
                            case OperationEnum.NonQuery:
                                conn.Open();
                                Result = command.ExecuteNonQuery();
                                conn.Close();
                                break;
                            case OperationEnum.Scalar:
                                conn.Open();
                                Result = command.ExecuteScalar();
                                conn.Close();
                                break;
                            case OperationEnum.QueryTable:
                                conn.Open();
                                var search = command.ExecuteReader();
                                Result = ConvertToHaxeQueryTable(search);
                                conn.Close();
                                break;

                            case OperationEnum.ObjectArray:
                                conn.Open();
                                DbDataReader reader = command.ExecuteReader();

                                Array<object> array = new Array<object>();
                                global::Array<string> _g2 = Fields(cl);

                                if (reader.HasRows)
                                {
                                    while (reader.Read())
                                    {
                                        object item = cl.Assembly.CreateInstance(cl.FullName);

                                        // itera por los campos del reader leídos desde la base
                                        for (int col = 0; col < reader.FieldCount; col++)
                                        {
                                            string fieldName = reader.GetName(col).ToString();
                                            if (_g2.__a.Contains(fieldName))
                                            {
                                                object value = reader.GetValue(reader.GetOrdinal(fieldName));
                                                object valueCast = HaxeCast(value);
                                                global::Reflect.setField(item, fieldName, valueCast); //campo guardar,nombre del campo, y valor del campo
                                            }
                                        }

                                        // liga el objeto al contexto, en caso que haya sido pasado como parámetro
                                        if (item is global::nMorph.framework.orm.client.ModelObject)
                                        {
                                            global::nMorph.framework.orm.client.ModelObject mo = (global::nMorph.framework.orm.client.ModelObject)(object)item;
                                            mo.ObjectEditType = nMorph.framework.orm.common.enums.ObjectEditTypeEnum.NOCHANGE;
                                            mo.ObjectSource = nMorph.framework.orm.common.enums.ObjectSourceTypeEnum.DB;
                                            if (context != null)
                                            {
                                                context.Objects.push(item);
                                                mo.TrackChanges = true;
                                            }
                                            else
                                            {
                                                mo.TrackChanges = false;
                                            }
                                        }

                                        array.push(item);
                                    }
                                }

                                Result = array;

                                conn.Close();
                                break;

                            case OperationEnum.SingleObject:
                                conn.Open();
                                DbDataReader reader1 = command.ExecuteReader();

                                global::Array<string> _g3 = Fields(cl);

                                if (reader1.HasRows)
                                {
                                    while (reader1.Read())
                                    {
                                        object item = cl.Assembly.CreateInstance(cl.FullName);

                                        // itera por los campos del reader leídos desde la base
                                        for (int col = 0; col < reader1.FieldCount; col++)
                                        {
                                            string fieldName = reader1.GetName(col).ToString();
                                            if (_g3.__a.Contains(fieldName))
                                            {
                                                object value = reader1.GetValue(reader1.GetOrdinal(fieldName));
                                                object valueCast = HaxeCast(value);
                                                global::Reflect.setField(item, fieldName, valueCast); //campo guardar,nombre del campo, y valor del campo
                                            }
                                        }

                                        // liga el objeto al contexto, en caso que haya sido pasado como parámetro
                                        if (item is global::nMorph.framework.orm.client.ModelObject)
                                        {
                                            global::nMorph.framework.orm.client.ModelObject mo = (global::nMorph.framework.orm.client.ModelObject)(object)item;
                                            mo.ObjectEditType = nMorph.framework.orm.common.enums.ObjectEditTypeEnum.NOCHANGE;
                                            mo.ObjectSource = nMorph.framework.orm.common.enums.ObjectSourceTypeEnum.DB;
                                            if (context != null)
                                            {
                                                context.Objects.push(item);
                                                mo.TrackChanges = true;
                                            }
                                            else
                                            {
                                                mo.TrackChanges = false;
                                            }
                                        }

                                        return item;

                                    }
                                }
                                conn.Close();
                                return null;
                        }
                    }
                }
            }
            return Result;
        }

        /// <summary>
        /// Transforma objetos en formato de la base de datos al formato de Haxe
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        private static object HaxeCast(object value)
        {
            unchecked
            {
                object valueCast = null;
                if (value == DBNull.Value)
                {
                    valueCast = null;
                }
                else if (value.GetType() == typeof(System.DateTime))
                {
                    valueCast = new Date((System.DateTime)value);
                }
                else if (value.GetType() == typeof(System.Byte[]))
                {
                    System.Byte[] blobByte = (System.Byte[])value;
                    haxe.io.Bytes haxeblob = haxe.io.Bytes.ofData(blobByte);
                    valueCast = haxeblob;
                }
                else if (value.GetType() == typeof(System.Guid))
                {
                    nMorph.framework.common.datatypes.UUID val = new framework.common.datatypes.UUID();
                    val.setValue(value.ToString());
                    valueCast = val;
                }
                else if (value.GetType() == typeof(System.TimeSpan))
                {
                    var ts = (System.TimeSpan)value;
					global::Date dx = new Date(2000, 1, ts.Days, ts.Hours, ts.Minutes, ts.Seconds);
                    valueCast = dx;
                }
                else
                {
                    valueCast = value;
                }

                return valueCast;
            }
        }

        //     public static String decodeQuery(String query)
        //     {
        //         string tableName = decodeTableName(query);
        //         //1) reemplazamos el nombre de la tabla en todas las coincidencias agregando "tableName"
        //         //2) reemplazamos todos los saltos de linea de la sentencia
        //         //3) reemplazamos Todos . por ."
        //         //4) reemplazamos todos , por ","
        //         //5) reemplazamos todos = por "=
        //         string sqlTraslate = query.Replace(tableName, "\"" + tableName + "\"");
        //         sqlTraslate = sqlTraslate.Replace("\n", "");
        //         sqlTraslate = sqlTraslate.Replace(".", ".\"");
        //         sqlTraslate = sqlTraslate.Replace(" =", "\" =");

        //         if (sqlTraslate.Contains("SELECT"))
        //         {
        //             if (!sqlTraslate.Contains("*"))
        //             {
        //                 if (sqlTraslate.Contains(") FROM"))
        //                     sqlTraslate = sqlTraslate.Replace(") FROM", "\") FROM");
        //                 else
        //                     sqlTraslate = sqlTraslate.Replace(" FROM", "\" FROM");
        //             }
        //         }
        //         if (sqlTraslate.Contains("FROM"))
        //         {
        //             sqlTraslate = sqlTraslate.Replace(", ", "\", \"");
        //         }
        //         if (sqlTraslate.Contains("INSERT"))
        //         {
        //             string[] elements = sqlTraslate.Split(new[] { "VALUES" }, StringSplitOptions.None);
        //             string firstElements = elements[0].Replace(", ", "\", \"");
        //             firstElements = firstElements.Replace("(", "(\"");
        //             firstElements = firstElements.Replace(")", "\")");
        //             sqlTraslate = firstElements + "VALUES" + elements[1];
        //         }
        //         if (sqlTraslate.Contains("UPDATE"))
        //         {
        //             sqlTraslate = sqlTraslate.Replace(", ", ", \"");
        //             sqlTraslate = sqlTraslate.Replace("SET ", "SET \"");
        //             sqlTraslate = sqlTraslate.Replace("WHERE", " WHERE");
        //         }
        //         if (sqlTraslate.Contains("DELETE"))
        //         {
        //             string[] elements = sqlTraslate.Split(new[] { "FROM" }, StringSplitOptions.None);
        //             string firstElement = elements[0].Replace("\"" + tableName + "\"", "");
        //             sqlTraslate = firstElement + " FROM " + elements[1];
        //         }
        //         return sqlTraslate;
        //     }

        //     public static string decodeTableName(string query)
        //     {
        //         string queryCast = "";
        //query = query.Replace("\n", "").Trim();;
        //         if (query.Contains("FROM"))
        //         {
        //             //1)Buscamos donde empieza el From
        //             //2)Buscamos donde empieza el Where
        //             //3)Quitamos los espacion
        //             //4)Obtenemos la cadena
        //             int ifrom = query.IndexOf("FROM");
        //             string subQuery = "";
        //             subQuery = query.Substring(ifrom);

        //             int iwhere = 0;
        //             if (subQuery.Contains("WHERE"))
        //             {
        //                 iwhere = subQuery.IndexOf("WHERE");
        //                 subQuery = subQuery.Substring(0,iwhere);
        //             }    

        //             subQuery = subQuery.Replace("FROM", "").Replace("WHERE", "");
        //             subQuery = subQuery.Trim();
        //             queryCast = subQuery;
        //         }
        //         if (query.Contains("INTO"))
        //         {
        //             //1)Buscamos donde empieza el INTO
        //             //2)Buscamos donde empieza el (
        //             //3)Quitamos los espacion
        //             //4)Obtenemos la cadena

        //             int iParameters = query.IndexOf("(");
        //	string subQuery = query.Substring(0,iParameters);				

        //             subQuery = subQuery.Replace("INSERT INTO", "");
        //             subQuery = subQuery.Trim();
        //             queryCast = subQuery;
        //         }
        //         if (query.Contains("PDATE"))
        //         {
        //             //1)Buscamos donde empieza el INTO
        //             //2)Buscamos donde empieza el (
        //             //3)Quitamos los espacion
        //             //4)Obtenemos la cadena
        //             int iInsert = query.IndexOf("UPDATE");
        //             int iParameters = query.IndexOf("SET");
        //             String subQuery = query.Substring(iInsert, iParameters);
        //             subQuery = subQuery.Replace("UPDATE", "").Replace("SET", "");
        //             subQuery = subQuery.Trim();
        //             queryCast = subQuery;
        //         }
        //         return queryCast;
        //     }

        public static Array<string> Fields(global::System.Type c)
        {
            Array<string> array = new Array<string>();
            FieldInfo[] fields = c.GetFields(BindingFlags.Public | BindingFlags.Instance | BindingFlags.NonPublic | BindingFlags.FlattenHierarchy);
            //PropertyInfo[]  fields = c.GetProperties();

            int num = 0;
            int length = fields.Length;
            while (num < length)
            {
                int num1 = num;
                num = num1 + 1;
                string name = fields[num1].Name;
                if (name.StartsWith("__hx_") || name == "__rtti" || name == "TrackChanges")
                {
                    continue;
                }
                array.push(name);
            }
            return array;
        }


        private static object ConvertToHaxeQueryTable(SqlDataReader dt)
        {
            QueryTable hdt = new QueryTable();

            for (int i = 0; i < dt.FieldCount; i++)
            {
                QueryColumn col = new QueryColumn();
                col.ColumnIndex = i;
                col.ColumnName = dt.GetName(i);
                col.ColumnType = ConvertToHaxeType(dt.GetFieldType(i));
                hdt.Columns.push(col);
            }
            int columnNumber = dt.FieldCount;
            if (dt.HasRows)
            {
                while (dt.Read())
                {
                    global::Array<object> arr = new Array<object>();

                    for (int i = 0; i < columnNumber; i++)
                    {
                        arr[i] = dt.GetValue(i);
                    }
                    QueryRow row = new QueryRow();
                    row.set_Items(arr);
                    hdt.Rows.push(row);
                }
            }
            return hdt;
        }

        //private static object ConvertToHaxeQueryTablePostgres(NpgsqlDataReader dt)
        //{
        //    QueryTable hdt = new QueryTable();

        //    for (int i = 0; i < dt.FieldCount; i++)
        //    {
        //        QueryColumn col = new QueryColumn();
        //        col.ColumnIndex = i;
        //        col.ColumnName = dt.GetName(i);
        //        col.ColumnType = ConvertToHaxeType(dt.GetFieldType(i));
        //        hdt.Columns.push(col);
        //    }
        //    int columnNumber = dt.FieldCount;
        //    if (dt.HasRows)
        //    {
        //        while (dt.Read())
        //        {
        //            global::Array<object> arr = new Array<object>();

        //            for (int i = 0; i < columnNumber; i++)
        //            {
        //                arr[i] = dt.GetValue(i);
        //            }
        //            QueryRow row = new QueryRow();
        //            row.set_Items(arr);
        //            hdt.Rows.push(row);
        //        }
        //    }
        //    return hdt;
        //}

        //private static object ConvertToHaxeQueryTableOracle(OracleDataReader dt)
        //{
        //    QueryTable hdt = new QueryTable();

        //    for (int i = 0; i < dt.FieldCount; i++)
        //    {
        //        QueryColumn col = new QueryColumn();
        //        col.ColumnIndex = i;
        //        col.ColumnName = dt.GetName(i);
        //        col.ColumnType = ConvertToHaxeType(dt.GetFieldType(i));
        //        hdt.Columns.push(col);
        //    }
        //    int columnNumber = dt.FieldCount;
        //    if (dt.HasRows)
        //    {
        //        while (dt.Read())
        //        {
        //            global::Array<object> arr = new Array<object>();

        //            for (int i = 0; i < columnNumber; i++)
        //            {
        //                arr[i] = dt.GetValue(i);
        //            }
        //            QueryRow row = new QueryRow();
        //            row.set_Items(arr);
        //            hdt.Rows.push(row);
        //        }
        //    }
        //    return hdt;
        //}

        //private static object ConvertToHaxeQueryTableMysql(MySqlDataReader dt)
        //{
        //    QueryTable hdt = new QueryTable();

        //    for (int i = 0; i < dt.FieldCount; i++)
        //    {
        //        QueryColumn col = new QueryColumn();
        //        col.ColumnIndex = i;
        //        col.ColumnName = dt.GetName(i);
        //        col.ColumnType = ConvertToHaxeType(dt.GetFieldType(i));
        //        hdt.Columns.push(col);
        //    }
        //    int columnNumber = dt.FieldCount;
        //    if (dt.HasRows)
        //    {
        //        while (dt.Read())
        //        {
        //            global::Array<object> arr = new Array<object>();

        //            for (int i = 0; i < columnNumber; i++)
        //            {
        //                arr[i] = dt.GetValue(i);
        //            }
        //            QueryRow row = new QueryRow();
        //            row.set_Items(arr);
        //            hdt.Rows.push(row);
        //        }
        //    }
        //    return hdt;
        //}

        public static object castBinary(object oBinary)
        {
            Object o;

            haxe.io.Bytes haxeObject = (haxe.io.Bytes)oBinary;
            byte[] dataByte = haxeObject.getData();
            o = dataByte;
            //global::Date date1 = (global::Date)oDate;
            //System.DateTime fecha = date1.date;
            //o = fecha;           
            return o;

        }

        public static Object castDateC(object oDate)
        {
            Object o;
            if (oDate != null && oDate.GetType() == typeof(global::Date))
            {
                global::Date date1 = (global::Date)oDate;
                System.DateTime fecha = date1.date;
                o = fecha;
            }
            else
            {
                o = oDate;
            }

            return o;
        }

        public static Object castUUID(object oUUID)
        {
            Object o;
            if (oUUID != null && oUUID.GetType() == typeof(global::nMorph.framework.common.datatypes.UUID))
            {
                global::nMorph.framework.common.datatypes.UUID id = (global::nMorph.framework.common.datatypes.UUID)oUUID;
                return new Guid(id.UUIDValue);
            }
            //return Guid.Empty;
			return null;
        }

        private static nMorph.framework.orm.common.enums.DBTypeEnum ConvertToHaxeType(System.Type type)
        {
            if (type == typeof(int)) return nMorph.framework.orm.common.enums.DBTypeEnum.INTEGER;
            if (type == typeof(long)) return nMorph.framework.orm.common.enums.DBTypeEnum.BIGINTEGER;
            if (type == typeof(string)) return nMorph.framework.orm.common.enums.DBTypeEnum.VARCHAR;
            if (type == typeof(double)) return nMorph.framework.orm.common.enums.DBTypeEnum.FLOAT;
            if (type == typeof(decimal)) return nMorph.framework.orm.common.enums.DBTypeEnum.DECIMAL;
            if (type == typeof(System.DateTime)) return nMorph.framework.orm.common.enums.DBTypeEnum.DATETIME;
            if (type == typeof(bool)) return nMorph.framework.orm.common.enums.DBTypeEnum.BOOLEAN;
            if (type == typeof(byte[])) return nMorph.framework.orm.common.enums.DBTypeEnum.BINARY;
            if (type == typeof(System.Guid)) return nMorph.framework.orm.common.enums.DBTypeEnum.UUID;

            return nMorph.framework.orm.common.enums.DBTypeEnum.VARCHAR;
        }

        public Array<SqlParameter> parametersSQL(global::Array<object> Parameters)
        {
            int count = 0;
            Array<SqlParameter> parametersSQL = new Array<SqlParameter>();
            while (count < Parameters.length)
            {
                object param;
                QueryParameter Param = (QueryParameter)Parameters[count];
                if (Param.DataType == global::nMorph.framework.orm.common.enums.DBTypeEnum.DATETIME)
                    param = castDateC(Param.get_Value());
                else if (Param.DataType == global::nMorph.framework.orm.common.enums.DBTypeEnum.UUID)
                    param = castUUID(Param.get_Value());
                else if (Param.DataType == global::nMorph.framework.orm.common.enums.DBTypeEnum.BINARY)
                    param = castBinary(Param.get_Value());
                else
                {
                    param = Param.get_Value();
                }

                if (param == null)
                    param = System.DBNull.Value;

                string paraName = Param.get_ParameterName();
                if (paraName.IndexOf("@") == -1)
                {

                    if (paraName.IndexOf(":") == -1)
                    {
                        paraName = paraName.Replace(paraName, "@" + paraName);
                    }
                    else
                    {
                        paraName = paraName.Substring(1);
                        paraName = "@" + paraName;
                    }

                }
                parametersSQL[count] = (new SqlParameter(paraName, param));
                count++;
            }
            return parametersSQL;
        }

        //public Array<MySqlParameter> parametersMYSQL(global::Array<object> Parameters)
        //{
        //    int count = 0;
        //    Array<MySqlParameter> parametersSQL = new Array<MySqlParameter>();
        //    while (count < Parameters.length)
        //    {
        //        object param;
        //        QueryParameter Param = (QueryParameter)Parameters[count];
        //        if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.DATETIME)
        //            param = castDateC(Param.get_Value());
        //        else
        //        {
        //            if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.BINARY)
        //            {
        //                param = castBinary(Param.get_Value());
        //            }
        //            else
        //                param = Param.get_Value();
        //        }

        //        string paraName = Param.get_ParameterName();
        //        if (paraName.IndexOf("@") == -1)
        //        {

        //            if (paraName.IndexOf(":") == -1)
        //            {
        //                paraName = paraName.Replace(paraName, "@" + paraName);
        //            }
        //            else
        //            {
        //                paraName = paraName.Substring(1);
        //                paraName = "@" + paraName;
        //            }
        //        }
        //        parametersSQL[count] = (new MySqlParameter(paraName, param));
        //        count++;
        //    }
        //    return parametersSQL;
        //}

        //public Array<NpgsqlParameter> parametersPOSTGRES(global::Array<object> Parameters)
        //{
        //    int count = 0;
        //    Array<NpgsqlParameter> parametersSQL = new Array<NpgsqlParameter>();
        //    while (count < Parameters.length)
        //    {
        //        bool isBinary = false;
        //        object param;
        //        Parameter Param = (Parameter)Parameters[count];
        //        if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.DATETIME)
        //            param = castDateC(Param.get_Value());
        //        else
        //        {
        //            if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.BINARY)
        //            {
        //                isBinary = true;
        //                param = castBinary(Param.get_Value());
        //            }
        //            else
        //                param = Param.get_Value();
        //        }

        //        string paraName = Param.get_ParameterName();
        //        if (paraName.IndexOf("@") == -1)
        //        {

        //            if (paraName.IndexOf(":") == -1)
        //            {
        //                paraName = paraName.Replace(paraName, "@" + paraName);
        //            }
        //            else
        //            {
        //                paraName = paraName.Substring(1);
        //                paraName = "@" + paraName;
        //            }

        //        }
        //        if (isBinary)
        //        {                    
        //            NpgsqlParameter pByte = new NpgsqlParameter(paraName, NpgsqlTypes.NpgsqlDbType.Bytea);
        //            pByte.Value = param;
        //            parametersSQL[count] = pByte;
        //        }
        //        else
        //            parametersSQL[count] = (new NpgsqlParameter(paraName, param));
        //        count++;
        //    }
        //    return parametersSQL;
        //}
        //public Array<OracleParameter> parametersOracle(global::Array<object> Parameters)
        //{
        //    int count = 0;
        //    Array<OracleParameter> parametersSQL = new Array<OracleParameter>();
        //    while (count < Parameters.length)
        //    {
        //        object param;
        //        Parameter Param = (Parameter)Parameters[count];
        //        if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.DATETIME)
        //            param = castDateC(Param.get_Value());
        //        else
        //        {
        //            if (Param.DataType == global::sw.framework.orm.common.enums.DBTypeEnum.BINARY)
        //            {
        //                param=castBinary(Param.get_Value());
        //            }
        //            else
        //                param = Param.get_Value();
        //        }

        //        string paraName = Param.get_ParameterName();
        //        if (paraName.IndexOf(":") == -1)
        //        {

        //            if (paraName.IndexOf("@") == -1)
        //            {
        //                paraName = paraName.Replace(paraName, ":" + paraName);
        //            }
        //            else
        //            {
        //                paraName = paraName.Substring(1);
        //                paraName = ":" + paraName;
        //            }

        //        }
        //        parametersSQL[count] = (new OracleParameter(paraName, param));
        //        count++;
        //    }
        //    return parametersSQL;
        //}
    }
    public enum OperationEnum
    {
        NonQuery = 0,
        Scalar = 1,
        QueryTable = 2,
        ObjectArray = 3,
        SingleObject = 4
    }
}
