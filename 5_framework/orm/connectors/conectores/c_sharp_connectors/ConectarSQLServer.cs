using System;
using System.Data.SqlClient;

namespace cornerstone.orm.client.conectores
{
    class ConectarSQLServer
    {
        public SqlConnection conectar (string server,string portDataBase, string database,string user,string password)
        {
            string connetionString = "Data Source=" + server + ","+ portDataBase + ";Initial Catalog=" + database + ";User ID=" + user + ";Password="+password;
            SqlConnection cnn;
            cnn = new SqlConnection(connetionString);           
            cnn.Open();
            Console.WriteLine("coneccion exitosa!!");
            return cnn;  
        }

        public void cerrarConeccion(SqlConnection conn)
        {
            conn.Close();
            Console.WriteLine("coneccion cerrada!!");
        }
    }
}