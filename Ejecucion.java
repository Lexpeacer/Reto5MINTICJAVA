package reto5;
// Integrante 1: Lina María Molano Rojas
// Integrante 2: Lexduing Jesid Urrea Buitrago
// Integrante 3: Leonardo César Valencia Ríos

import java.sql.Connection;
import java.util.ArrayList;


public class Ejecucion {
    public static void main(String[] args) {
        Connection conn = ConexionBD.conectarBD();
        
        //CRUD - C - CREATE
            // INSERCIÓN FABRICANTES
        Fabricante fabricanteUno = new Fabricante("Cannondale");
        Fabricante fabricanteDos = new Fabricante("Trek");
        Fabricante fabricanteTres = new Fabricante("Yeti");
        Fabricante fabricanteCuatro = new Fabricante("Fuji");
        Fabricante fabricanteCinco = new Fabricante("Bmc");
        Fabricante fabricanteSeis = new Fabricante("Starker");
        Fabricante fabricanteSiete = new Fabricante("Lucky Lion");
        Fabricante fabricanteOcho = new Fabricante("Be Electric");
        Fabricante fabricanteNueve = new Fabricante("Aima");
        Fabricante fabricanteDiez = new Fabricante("Mec de Colombia");
        Fabricante fabricanteOnce = new Fabricante("Atom Electric");
        
        boolean insercionFabricanteUno = FabricanteDAO.insertarFabricante(conn, fabricanteUno);
        boolean insercionFabricanteDos = FabricanteDAO.insertarFabricante(conn, fabricanteDos);
        boolean insercionFabricanteTres = FabricanteDAO.insertarFabricante(conn, fabricanteTres);
        boolean insercionFabricanteCuatro = FabricanteDAO.insertarFabricante(conn, fabricanteCuatro);
        boolean insercionFabricanteQuinto = FabricanteDAO.insertarFabricante(conn, fabricanteCinco);
        boolean insercionFabricanteSexto = FabricanteDAO.insertarFabricante(conn, fabricanteSeis);
        boolean insercionFabricanteSiete = FabricanteDAO.insertarFabricante(conn, fabricanteSiete);
        boolean insercionFabricanteOcho = FabricanteDAO.insertarFabricante(conn, fabricanteOcho);
        boolean insercionFabricanteNueve = FabricanteDAO.insertarFabricante(conn, fabricanteNueve);
        boolean insercionFabricanteDiez = FabricanteDAO.insertarFabricante(conn, fabricanteDiez);
        boolean insercionFabricanteOnce = FabricanteDAO.insertarFabricante(conn, fabricanteOnce);
        
        if (insercionFabricanteUno==true & insercionFabricanteDos==true &
                insercionFabricanteTres==true & insercionFabricanteCuatro==true &
                insercionFabricanteQuinto==true & insercionFabricanteSexto==true &
                insercionFabricanteSiete==true & insercionFabricanteOcho==true &
                insercionFabricanteNueve==true & insercionFabricanteDiez==true &
                insercionFabricanteOnce==true){
            System.out.println("INSERCIÓN DE FABRICANTES CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE FABRICANTES CORRECTAMENTE");
        }
        
            // INSERCIÓN CLIENTES
        Clientes clienteUno = new Clientes("lucky","Pedro","Perez","kukustrm@gmail.com","3105020970",1034,"1991-09-29");
        Clientes clienteDos = new Clientes("malopez","Maria","Lopez","jjhxqhvn@gmail.com","3104273350",7697,"1988-01-21");
        Clientes clienteTres = new Clientes("diva","Ana","Diaz","nslxmiex@gmail.com","3107259683",7203,"1988-05-07");
        Clientes clienteCuatro = new Clientes("dreamer","Luis","Rojas","chyisgib@gmail.com","3108505919",3801,"1984-09-30");
        Clientes clienteCinco = new Clientes("ninja","Andres","Cruz","esyhkyhq@gmail.com","3105108154",6490,"1981-02-21");
        Clientes clienteSeis = new Clientes("neon","Nelson","Ruiz","jfflbkjo@gmail.com","3101756040",6745,"1999-06-14");
        Clientes clienteSiete = new Clientes("rose","Claudia","Mendez","zhqpwqpv@gmail.com","3105793938",7111,"1997-01-19");
        Clientes clienteOcho = new Clientes("green","Jorge","Rodriguez","nwqlwojz@gmail.com","3107054068",4316,"2000-05-05");
        
        boolean insercionClientesUno = ClientesDAO.insertarClientes(conn, clienteUno);
        boolean insercionClientesDos = ClientesDAO.insertarClientes(conn, clienteDos);
        boolean insercionClientesTres = ClientesDAO.insertarClientes(conn, clienteTres);
        boolean insercionClientesCuatro = ClientesDAO.insertarClientes(conn, clienteCuatro);
        boolean insercionClientesQuinto = ClientesDAO.insertarClientes(conn, clienteCinco);
        boolean insercionClientesSexto = ClientesDAO.insertarClientes(conn, clienteSeis);
        boolean insercionClientesSiete = ClientesDAO.insertarClientes(conn, clienteSiete);
        boolean insercionClientesOcho = ClientesDAO.insertarClientes(conn, clienteOcho);
        
        if (insercionClientesUno==true & insercionClientesDos==true &
                insercionClientesTres==true & insercionClientesCuatro==true &
                insercionClientesQuinto==true & insercionClientesSexto==true &
                insercionClientesSiete==true & insercionClientesOcho==true){
            System.out.println("INSERCIÓN DE CLIENTES CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE CLIENTES CORRECTAMENTE");
        }

            // INSERCIÓN PROVEEDORES
        Proveedor proveedorUno = new Proveedor(101, "Auteco","calle 7 No. 45-17", "05713224459");
        Proveedor proveedorDos = new Proveedor(102, "Hitachi", "calle 19 No. 108-26", "05714223344");
        Proveedor proveedorTres = new Proveedor(103, "Bosch", "carrera 68 No. 26-45", "05715678798");
        Proveedor proveedorCuatro = new Proveedor(104, "Teco", "calle 77 No. 68-33", "05712213243");
        Proveedor proveedorCinco = new Proveedor(105, "General Electric", "calle 29 No. 26-12", "05717239919");
        
        boolean insercionProveedorUno = ProveedorDAO.insertarProveedor(conn, proveedorUno);
        boolean insercionProveedorDos = ProveedorDAO.insertarProveedor(conn, proveedorDos);
        boolean insercionProveedorTres = ProveedorDAO.insertarProveedor(conn, proveedorTres);
        boolean insercionProveedorCuatro = ProveedorDAO.insertarProveedor(conn, proveedorCuatro);
        boolean insercionProveedorCinco = ProveedorDAO.insertarProveedor(conn, proveedorCinco);
        
        if (insercionProveedorUno==true & insercionProveedorDos==true &
                insercionProveedorTres==true & insercionProveedorCuatro==true &
                insercionProveedorCinco==true){
            System.out.println("INSERCIÓN DE PROVEEDORES CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE PROVEEDORES CORRECTAMENTE");
        }
        
            // INSERCIÓN BICICLETAS
        Bicicletas bicicletaUno = new Bicicletas("Cannondale",1200000,2020);
        Bicicletas bicicletaDos = new Bicicletas("Trek",1450000,2019);
        Bicicletas bicicletaTres = new Bicicletas("Yeti",2000000,2020);
        Bicicletas bicicletaCuatro = new Bicicletas("Fuji",950000,2021);
        Bicicletas bicicletaCinco = new Bicicletas("Bmc",1950000,1018);
        
        boolean insercionBicicletasUno = BicicletasDAO.insertarBicicletas(conn, bicicletaUno);
        boolean insercionBicicletasDos = BicicletasDAO.insertarBicicletas(conn, bicicletaDos);
        boolean insercionBicicletasTres = BicicletasDAO.insertarBicicletas(conn, bicicletaTres);
        boolean insercionBicicletasCuatro = BicicletasDAO.insertarBicicletas(conn, bicicletaCuatro);
        boolean insercionBicicletasQuinto = BicicletasDAO.insertarBicicletas(conn, bicicletaCinco);
        
         if (insercionBicicletasUno==true & insercionBicicletasDos==true &
                insercionBicicletasTres==true & insercionBicicletasCuatro==true &
                insercionBicicletasQuinto==true){
            System.out.println("INSERCIÓN DE BICICLETAS CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE BICICLETAS CORRECTAMENTE");
        }
        
            // INSERCIÓN MOTOCICLETA
        Motocicleta motocicletaUno = new Motocicleta("Starker",4200000,18,101);
        Motocicleta motocicletaDos = new Motocicleta("Lucky Lion",5600000,14,102);
        Motocicleta motocicletaTres = new Motocicleta("Be Electric",4600000,26,101);
        Motocicleta motocicletaCuatro = new Motocicleta("Aima",8000000,36,103);
        Motocicleta motocicletaCinco = new Motocicleta("Mec de Colombia",5900000,20,104);
        Motocicleta motocicletaSeis = new Motocicleta("Atom Electric",4500000,12,105);
        
        boolean insercionMotocicletaUno = MotocicletaDAO.insertarMotocicleta(conn, motocicletaUno);
        boolean insercionMotocicletaDos = MotocicletaDAO.insertarMotocicleta(conn, motocicletaDos);
        boolean insercionMotocicletaTres = MotocicletaDAO.insertarMotocicleta(conn, motocicletaTres);
        boolean insercionMotocicletaCuatro = MotocicletaDAO.insertarMotocicleta(conn, motocicletaCuatro);
        boolean insercionMotocicletaCinco = MotocicletaDAO.insertarMotocicleta(conn, motocicletaCinco);
        boolean insercionMotocicletaSeis = MotocicletaDAO.insertarMotocicleta(conn, motocicletaSeis);
        
         if (insercionMotocicletaUno==true & insercionMotocicletaDos==true &
                insercionMotocicletaTres==true & insercionMotocicletaCuatro==true &
                insercionMotocicletaCinco==true & insercionMotocicletaSeis==true){
            System.out.println("INSERCIÓN DE MOTOCICLETA CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE MOTOCICLETA CORRECTAMENTE");
        }
        
            // INSERCIÓN INTENCIÓN DE COMPRA
        IntencCompra intencCompraUno = new IntencCompra("lucky","Cannondale","2017-10-25 20:00:00");
        IntencCompra intencCompraDos = new IntencCompra("lucky","Trek","2019-03-15 18:30:00");
        IntencCompra intencCompraTres = new IntencCompra("lucky","Starker","2019-05-20 20:30:00");
        IntencCompra intencCompraCuatro = new IntencCompra("malopez","Cannondale","2018-05-20 20:30:00");
        IntencCompra intencCompraCinco = new IntencCompra("malopez","Starker","2020-01-20 20:30:00");
        IntencCompra intencCompraSeis = new IntencCompra("diva","Yeti","2019-05-20 20:30:00");
        IntencCompra intencCompraSiete = new IntencCompra("diva","Fuji","2018-06-22 21:30:00");
        IntencCompra intencCompraOcho = new IntencCompra("diva","Lucky Lion","2020-03-17 15:30:20");
        IntencCompra intencCompraNueve = new IntencCompra("dreamer","Lucky Lion","2020-03-17 15:30:20");
        IntencCompra intencCompraDiez = new IntencCompra("dreamer","Be Electric","2020-04-10 18:30:20");
        IntencCompra intencCompraOnce = new IntencCompra("ninja","Aima","2020-02-17 20:30:20");
        IntencCompra intencCompraDoce = new IntencCompra("ninja","Starker","2020-02-20 16:30:20");
        IntencCompra intencCompraTrece = new IntencCompra("ninja","Mec de Colombia","2020-03-27 18:30:20");
        IntencCompra intencCompraCatorce = new IntencCompra("rose","Atom Electric","2020-03-20 21:30:20");
        IntencCompra intencCompraQuince = new IntencCompra("green","Yeti","2020-01-10 17:30:20");
        IntencCompra intencCompraDieciseis = new IntencCompra("green","Trek","2020-02-15 20:30:20");
        IntencCompra intencCompraDiecisiete = new IntencCompra("green","Bmc","2020-03-17 18:30:20");

        boolean insercionIntencCompraUno = IntencCompraDAO.insertarIntencCompra(conn, intencCompraUno);
        boolean insercionIntencCompraDos = IntencCompraDAO.insertarIntencCompra(conn, intencCompraDos);
        boolean insercionIntencCompraTres = IntencCompraDAO.insertarIntencCompra(conn, intencCompraTres);
        boolean insercionIntencCompraCuatro = IntencCompraDAO.insertarIntencCompra(conn, intencCompraCuatro);
        boolean insercionIntencCompraCinco = IntencCompraDAO.insertarIntencCompra(conn, intencCompraCinco);
        boolean insercionIntencCompraSeis = IntencCompraDAO.insertarIntencCompra(conn, intencCompraSeis);
        boolean insercionIntencCompraSiete = IntencCompraDAO.insertarIntencCompra(conn, intencCompraSiete);
        boolean insercionIntencCompraOcho = IntencCompraDAO.insertarIntencCompra(conn, intencCompraOcho);
        boolean insercionIntencCompraNueve = IntencCompraDAO.insertarIntencCompra(conn, intencCompraNueve);
        boolean insercionIntencCompraDiez = IntencCompraDAO.insertarIntencCompra(conn, intencCompraDiez);
        boolean insercionIntencCompraOnce = IntencCompraDAO.insertarIntencCompra(conn, intencCompraOnce);
        boolean insercionIntencCompraDoce = IntencCompraDAO.insertarIntencCompra(conn, intencCompraDoce);
        boolean insercionIntencCompraTrece = IntencCompraDAO.insertarIntencCompra(conn, intencCompraTrece);
        boolean insercionIntencCompraCatorce = IntencCompraDAO.insertarIntencCompra(conn, intencCompraCatorce);
        boolean insercionIntencCompraQuince = IntencCompraDAO.insertarIntencCompra(conn, intencCompraQuince);
        boolean insercionIntencCompraDieciseis = IntencCompraDAO.insertarIntencCompra(conn, intencCompraDieciseis);
        boolean insercionIntencCompraDiecisiete = IntencCompraDAO.insertarIntencCompra(conn, intencCompraDiecisiete);
        
        if (insercionIntencCompraUno ==true & insercionIntencCompraDos ==true
                &insercionIntencCompraCuatro ==true &insercionIntencCompraCinco ==true
                &insercionIntencCompraSeis ==true &insercionIntencCompraSiete ==true
                &insercionIntencCompraOcho ==true &insercionIntencCompraNueve ==true
                &insercionIntencCompraDiez ==true &insercionIntencCompraOnce ==true
                &insercionIntencCompraDoce ==true &insercionIntencCompraTrece ==true
                &insercionIntencCompraCatorce ==true &insercionIntencCompraQuince ==true
                &insercionIntencCompraDieciseis ==true &insercionIntencCompraDiecisiete ==true){
            System.out.println("INSERCIÓN DE INTENCIÓN DE COMPRA CORRECTAMENTE");
        }else{
            System.out.println("ERROR INSERCIÓN DE INTENCIÓN DE COMPRA");
        }
        
        // CRUD U - UPDATE
            //1er UPDATE
        boolean modificarAnno = BicicletasDAO.actualizarBicicletas(conn);
        
         if (modificarAnno==true){
            System.out.println("ACTUALIZÓ BICICLETAS CORRECTAMENTE");
        }else{
            System.out.println("ERROR ACTUALIZACIÓN BICICLETAS");
        }
        
            //2DO UPDATE
        boolean actualizarCelNinja = ClientesDAO.actualizarCelNinja(conn);
        
         if (actualizarCelNinja==true){
            System.out.println("ACTUALIZÓ CLIENTES CORRECTAMENTE");
        }else{
            System.out.println("ERROR ACTUALIZACIÓN CLIENTES");
        }
        
        
        // CRUD D - DELETE
        boolean borrarIntCompra = IntencCompraDAO.borrarIntCompra(conn);
        
         if (borrarIntCompra==true){
            System.out.println("ELIMINÓ INTENCIÓN DE COMPRA CORRECTAMENTE");
        }else{
            System.out.println("ERROR ELIMINACIÓN INTENCIÓN DE COMPRA");
        }
         
        // CRUD R - READ
            //CONSULTAS
        System.out.println("\nConsulta 1");
        ArrayList<Fabricante> listaFabricante = FabricanteDAO.obtenerFabricante(conn);
        for (int dato = 0; dato<listaFabricante.size(); dato++){
            System.out.println(listaFabricante.get(dato));
        }
        
        System.out.println("\nConsulta 2");
        ArrayList<Bicicletas> listaBicicletas = BicicletasDAO.obtenerBicicletas(conn);
        for (int dato = 0; dato<listaBicicletas.size(); dato++){
            System.out.println(listaBicicletas.get(dato));
        }
        
        System.out.println("\nConsulta 3");
        ArrayList<Motocicleta> listaMotocicleta = MotocicletaDAO.obtenerMotocicleta(conn);
        for (int dato = 0; dato<listaMotocicleta.size(); dato++){
            System.out.println(listaMotocicleta.get(dato));
        }
        
        System.out.println("\nConsulta 4");
        ArrayList<IntencCompra> listaIntencCompra = IntencCompraDAO.obtenerIntencCompra(conn);
        for (int dato = 0; dato<listaIntencCompra.size(); dato++){
            System.out.println(listaIntencCompra.get(dato));
        }
        
        System.out.println("\nConsulta 5 ");
        ArrayList<Clientes> listaIntenClient = ClientesDAO.obtenerIntenClient(conn);
        for (int dato = 0; dato<listaIntenClient.size(); dato++){
            System.out.println(listaIntenClient.get(dato));        
        }
        
        System.out.println("\nConsulta 6");   
        ArrayList<Bicicletas> contador = BicicletasDAO.conteo(conn);
            System.out.println(contador.size());
    }   
}
