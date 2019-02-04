using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Tarea2Herramientas
{
    public class Singleton
    {
        private static Singleton instanciado;

        private Singleton() { }

        public static Singleton Instanciado
        {
            get
            {
                if (instanciado == null)
                {
                    instanciado = new Singleton();
                }
                return instanciado;
            }
        }

        static void Main(string[] args)
        {
        }
    }
}
