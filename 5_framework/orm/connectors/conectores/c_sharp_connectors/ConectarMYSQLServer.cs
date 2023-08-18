using MySql.Data.MySqlClient;
using System;

namespace cornerstone.orm.client.conectores
{
    class ConectarMYSQLServer
    {
        public MySqlConnection conectar(string server, string serverPort, string database, string user, string password)
        {
            string connetionString = "SERVER=" + server + ";Port=" + serverPort + "; DATABASE=" + database + ";  UID=" + user + "; PASSWORD=" + password + ";";
            MySqlConnection cnn;
            cnn = new MySqlConnection(connetionString);
            cnn.Open();
            Console.WriteLine("coneccion exitosa!!");
            return cnn;
        }

        public void cerrarConeccion(MySqlConnection conn)
        {
            conn.Close();
            Console.WriteLine("coneccion cerrada!!");
        }
    }
}