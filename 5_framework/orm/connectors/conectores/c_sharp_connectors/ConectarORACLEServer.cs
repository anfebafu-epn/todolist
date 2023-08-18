
using Oracle.DataAccess.Client;
using System;

namespace cornerstone.orm.client.conectores
{
    class ConectarORACLEServer
    {
        public OracleConnection conectar(string server,string serverPort, string database, string user, string password)
        {            
            string connetionString = "User Id=" + user + ";Password=" + password + ";Data Source=" + server + ":" + serverPort + "/" + database;
            OracleConnection cnn;
            cnn = new OracleConnection(connetionString);            
            cnn.Open();
            Console.WriteLine("coneccion exitosa!!");
            return cnn;

        }

        public void cerrarConeccion(OracleConnection conn)
        {
            conn.Close();
            Console.WriteLine("coneccion cerrada!!");
        }
    }
}
