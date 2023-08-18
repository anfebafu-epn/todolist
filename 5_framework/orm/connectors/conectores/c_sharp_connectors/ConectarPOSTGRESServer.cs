using Npgsql;
using System;


namespace cornerstone.orm.client.conectores
{
    class ConectarPOSTGRESServer
    {
        public NpgsqlConnection conectar(string server, string serverPort, string database, string user, string password)
        {
            string connetionString = "Server=" + server + ";Port=" + serverPort + "; Database=" + database + ";  User Id=" + user + "; Password=" + password + ";";
            NpgsqlConnection cnn;
            cnn = new NpgsqlConnection(connetionString);            
            cnn.Open();
            Console.WriteLine("coneccion exitosa!!");
            return cnn;                           
        }

        public void cerrarConeccion(NpgsqlConnection conn)
        {
            conn.Close();
            Console.WriteLine("coneccion cerrada!!");
        }

    }
}