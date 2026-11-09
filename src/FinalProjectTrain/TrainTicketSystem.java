package FinalProjectTrain;

public class TrainTicketSystem {

    //Creacion de las variables para las entidades

    // usuarios ok

    static int id;
    static String nombre;
    static String apellido;
    static String origen;
    static String destino;

    // usuario cajero

    static String rol;
    static String password;

    //tren ok

    static int trenId;
    static String modelo;
    static int capacidad;

    //ticket ok

    static int ticketId;
    static int usuario;
    static String origenRuta;
    static String destinoRuta;
    static String silla;
    static int tren;
    static String fecha;
    static String hora;
    static double precio;

    //venta ok

    static int ventaId;
    static int ticketIdVenta;
    static int cantidad;
    static double precioVentaUnitario;
    static double totalVenta;


    public static void main(String[] args) {

        registrarCajero();


        if (iniciarsesion()){
            String trainTicket = "no";


            while (trainTicket.equals("no")) {

                System.out.println("=======FERROCARRILES DE ANTIOQUIA======= \n" +
                        "1.Gestion de usuarios \n" +
                        "2.Gestion de Trenes \n" +
                        "3.Gestion de tickets \n" +
                        "4.Gestion de ventas \n" +
                        "5.Gestion de cajeros \n" +
                        "6.Salir");

                int opcion =ValidadorDeTipo.ValidarEnteros();


                switch (opcion) {

                    //Submenu del usuario
                    case 1: {

                        int opcionUsuario = 0;

                        while (opcionUsuario != 6) {
                            System.out.println("\n=====Gestion de usuarios=====");
                            System.out.println("1. Crear usuario");
                            System.out.println("2. Actualizar usuario");
                            System.out.println("3. Consultar todos los usuarios");
                            System.out.println("4. Consultar usuario por ID");
                            System.out.println("5. Eliminar usuario");
                            System.out.println("6. Volver al menu principal");

                            opcionUsuario = ValidadorDeTipo.ValidarEnteros();

                            switch (opcionUsuario) {

                                case 1:
                                    crearUsuario();
                                    break;

                                case 2:
                                    actualizarDatos();
                                    break;

                                case 3:
                                    consultarUsuario();
                                    break;

                                case 4:
                                    consultarUsuarioPorId();
                                    break;

                                case 5:
                                    eliminarUsuario();
                                    break;

                                case 6:
                                    System.out.println("Regresar al menu principal");
                                    break;

                                default:
                                    System.out.println("Opcion no valida.");
                                    break;

                            }
                        }
                        break;

                    }

                    case 2:{
                        int opcionTrenes=0;

                        while (opcionTrenes !=6){
                            System.out.println("\n=====Gestion de trenes=====");
                            System.out.println("1.Crear tren");
                            System.out.println("2.Actualizar tren");
                            System.out.println("3.Consultar todos los trenes");
                            System.out.println("4.Consultar tren por ID");
                            System.out.println("5.Eliminar tren");
                            System.out.println("6.Volver al menu principal");
                            opcionTrenes=ValidadorDeTipo.ValidarEnteros();

                            switch (opcionTrenes){
                                case 1:
                                    crearTren();
                                    break;

                                case 2:
                                    actualizarTren();
                                    break;

                                case 3:
                                    consultarTrenes();
                                    break;

                                case 4:
                                    consultarTrenPorId();
                                    break;

                                case 5:
                                    eliminarTren();
                                    break;

                                case 6:
                                    System.out.println("Regresar al menu principal");
                                    break;

                                default:
                                    System.out.println("Opcion no valida.");
                                    break;
                            }
                        }
                        break;
                    }
                    //submenu de los tickets

                    case 3: {
                        int opcionTicket=0;

                        while (opcionTicket !=6){
                            System.out.println("\n=====Gestion de tickets=====");
                            System.out.println("1. Crear ticket");
                            System.out.println("2. Actualizar ticket");
                            System.out.println("3. Consultar todos los tickets");
                            System.out.println("4. Consultar ticket por ID");
                            System.out.println("5. Eliminar ticket");
                            System.out.println("6. Volver al menu principal");

                            opcionTicket=ValidadorDeTipo.ValidarEnteros();

                            switch (opcionTicket){
                                case 1:
                                    crearTicket();
                                    break;
                                case 2:
                                    actualizarTicket();
                                    break;
                                case 3:
                                    consultarTicket();
                                    break;
                                case 4:
                                    consultarTicketPorId();
                                    break;
                                case 5:
                                    eliminarTicket();
                                    break;
                                case 6:
                                    System.out.println("Regresar al menu principal");
                                    break;
                                default:
                                    System.out.println("Opcion no valida. ");
                                    break;
                            }
                        }
                        break;
                    }


                    case 4:{
                        int opcionVentas=0;

                        while (opcionVentas !=6){
                            System.out.println("\n=====Gestion de ventas=====");
                            System.out.println("1. Crear venta");
                            System.out.println("2. Actualizar venta");
                            System.out.println("3. Consultar todos las ventas");
                            System.out.println("4. Consultar ventas por ID");
                            System.out.println("5. Eliminar ventas");
                            System.out.println("6. Volver al menu principal");
                            opcionVentas=ValidadorDeTipo.ValidarEnteros();

                            switch (opcionVentas){
                                case 1:
                                    crearVenta();
                                    break;
                                case 2:
                                    actualizarVentas();
                                    break;
                                case 3:
                                    consultarVentas();
                                    break;
                                case 4:
                                    consultarVentasPorId();
                                    break;
                                case 5:
                                    eliminarVenta();
                                    break;
                                case 6:
                                    System.out.println("Regresar al menu principal");
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                                    break;
                            }

                        }
                        break;

                    }


                    case 5: {
                        int opcionCajero=0;

                        while(opcionCajero !=6){
                            System.out.println("\n=====Gestion de cajeros=====");
                            System.out.println("1. Crear cajero");
                            System.out.println("2. Actualizar rol");
                            System.out.println("3. Consultar cajero");
                            System.out.println("5. Eliminar cajero");
                            System.out.println("6. Volver al menu principal");
                            opcionCajero=ValidadorDeTipo.ValidarEnteros();

                            switch (opcionCajero){
                                case 1:
                                    registrarCajero();
                                    break;
                                case 2:
                                    consultarCajero();
                                    break;
                                case 3:
                                    actualizarCajero();
                                    break;
                                case 4:
                                    eliminarCajero();
                                    break;
                                case 5:
                                    System.out.println("Regresar al menu principal");
                                    break;
                                default:
                                    System.out.println("Opcion no valida.");
                            }
                        }
                        break;

                    }

                    case 6:
                        trainTicket = "si";
                        System.out.println("Gracias por usar el sistema");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        }
    }


    //Array y matrices usuarios

    static String[][] usuarios = new String[1][5];


    //metodos de usuario

    static String[]encabezados={
            "id","nombre","apellido","origen","destino"
    };



    public static void crearUsuario(){
        for (int i=0; i < encabezados.length; i++){
            System.out.println(encabezados[i]);
        }

        for(int i=0 ; i < usuarios.length; i++){
            for(int j = 0; j<usuarios[i].length;j++){
                System.out.println("Ingrese dato" + j +": ");
                usuarios[i][j]=ValidadorDeTipo.ValidarString();
            }
        }
    }

    public static void consultarUsuario(){
        for (int i=0; i<encabezados.length; i++){
            System.out.print(encabezados[i]+ "\t");
        }

        System.out.println();

        for (int i=0; i<usuarios.length; i++){

            for (int j=0; j<usuarios[i].length;j++){
                System.out.print(usuarios[i][j]+ "\t");
            }
            System.out.println();

        }
    }

    public static void consultarUsuarioPorId(){
        System.out.println("Ingrese el ID del usuario: ");
        String idBuscar=ValidadorDeTipo.ValidarString();

        for(int i=0; i<usuarios.length; i++){

            if (usuarios[i][0] != null && usuarios[i][0].equals(idBuscar)){

                for (int j =0; j<usuarios[i].length; j++){
                    System.out.println(encabezados[j]+ ": "+usuarios[i][j]);
                }
                return;

            }
        }

        System.out.println("Usuario no encontrado.");
    }

    public static void actualizarDatos(){
        System.out.print("Ingrese el ID del usuario que desea actualizar: ");
        String idBuscar=ValidadorDeTipo.ValidarString();

        for (int i=0; i<usuarios.length; i++){
            if (usuarios[i][0] != null && usuarios[i][0].equals(idBuscar)){
                for (int j =1; j<usuarios[i].length; j++){

                    System.out.print("Ingrese nuevo "+ encabezados[j]+ ": ");
                    usuarios[i][j]=ValidadorDeTipo.ValidarString();
                }
                System.out.println("Usuario actualizado correctamente. ");
                return;
            }
        }

        System.out.println("Usuario no encontrado.");
    }


    public static void eliminarUsuario(){
        System.out.println("Ingrese el ID del usuario que desea eliminar: ");
        String idEliminar=ValidadorDeTipo.ValidarString();

        for (int i=0; i<usuarios.length; i++){
            if (usuarios[i][0] != null && usuarios[i][0].equals(idEliminar)){
                for (int j=0; j<usuarios[i].length; j++){
                    usuarios[i][j]=null;
                }
                System.out.println("Usuario eliminado correctamente: ");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");


    }


    //Array y matrices trenes
    static String[][] trenes = new String[1][3];

    //metodos de trenes
    static String[] encabezadosTren ={
            "id","modelo","capacidad"
    };

    static public void crearTren(){
        for (int i=0; i<encabezadosTren.length;i++){
            System.out.println(encabezadosTren[i]);
        }
        for (int i=0; i<trenes.length;i++){
            for (int j=0; j<trenes[i].length;j++){
                System.out.println("Ingrese dato del tren"+j+ ": ");
                trenes[i][j]=ValidadorDeTipo.ValidarString();
            }
        }

    }

    static public void  consultarTrenes(){
        for (int i=0; i<encabezadosTren.length;i++){
            System.out.print(encabezadosTren[i]+"\t");
        }
        System.out.println();

        for (int i=0;i<trenes.length;i++){

            for (int j=0; j<trenes[i].length;j++){
                System.out.print(trenes[i][j]+"\t");
            }
            System.out.println();
        }

    }

    static  public void consultarTrenPorId(){
        System.out.println("Ingrese el ID del tren: ");
        String idBuscarTren=ValidadorDeTipo.ValidarString();

        for (int i=0; i<trenes.length;i++){
            if (trenes[i][0] !=null && trenes[i][0].equals(idBuscarTren)){

                for (int j =0; j<trenes[i].length;j++){
                    System.out.println(encabezadosTren[j]+ ": "+trenes[i][j]);
                }
                return;
            }
        }
    }

    static public  void actualizarTren(){
        System.out.println("Ingrese el ID del tren que desea actualizar: ");
        String idBuscarTren=ValidadorDeTipo.ValidarString();

        for (int i=0; i<trenes.length;i++){
            if (trenes[i][0] != null && trenes[i][0].equals(idBuscarTren)){
                for (int j = 1; j<trenes[i].length;j++){
                    System.out.println("Ingrese nuevo tren "+ encabezadosTren[j]+ ": ");
                    trenes[i][j]=ValidadorDeTipo.ValidarString();
                }
                System.out.println("Tren actualizado correctamente. ");
                return;
            }
        }
        System.out.println("Tren no encontrado.");
    }

    static public void eliminarTren(){
        System.out.println("Ingrese el ID del usuario que desea eliminar: ");
        String idEliminar=ValidadorDeTipo.ValidarString();

        for (int i=0; i<trenes.length; i++){
            if (trenes[i][0] !=null && trenes[i][0].equals(idEliminar)){
                for (int j=0; j<trenes[i].length;j++){
                    trenes[i][j]=null;
                }
                System.out.println("Tren eliminado correctamente: ");
                return;
            }
        }
        System.out.println("Tren no encontrado.");
    }

    // array y matrices tickets
    static String [][] ticketes=new String[1][9];

    //metodos de tickets

    static String[] encabezadosTicket={
            "id","usuario","origenRuta","destinoRuta","silla","tren","fecha","hora","precio"
    };

    static public void crearTicket(){
        for (int i=0; i<encabezadosTicket.length;i++){
            System.out.println(encabezadosTicket[i]);
        }
        for (int i=0; i<ticketes.length; i++){
            for (int j=0; j<ticketes[i].length;j++){
                System.out.println("Ingrese dato del ticket"+j+ ": ");
                ticketes[i][j]=ValidadorDeTipo.ValidarString();
            }
        }
    }

    static public void consultarTicket(){
        for (int i=0; i<encabezadosTicket.length;i++){
            System.out.print(encabezadosTicket[i]+"\t");
        }
        System.out.println();

        for (int i=0; i<ticketes.length;i++){
            for (int j=0;j<ticketes[i].length;j++){
                System.out.print(ticketes[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static public void consultarTicketPorId(){
        System.out.println("Ingrese el ID del ticket: ");
        String idBuscarTicket=ValidadorDeTipo.ValidarString();

        for (int i=0; i<ticketes.length;i++){
            if (ticketes[i][0] !=null && ticketes[i][0].equals(idBuscarTicket)){
                for (int j=0; j<ticketes[i].length;j++){
                    System.out.println(encabezadosTicket[j]+ ": "+ticketes[i][j]);
                }
                return;
            }
        }
    }

    static public void actualizarTicket(){
        System.out.println("Ingrese el ID del ticket que desea actualizar: ");
        String idBuscarTicket=ValidadorDeTipo.ValidarString();

        for (int i=0; i<ticketes.length;i++){
            if (ticketes[i][0] != null && ticketes[i][0].equals(idBuscarTicket)){
                for (int j=1; j<ticketes[i].length;j++){
                    System.out.println("Ingrese nuevo ticket"+encabezadosTicket[j]+": ");
                    ticketes[i][j]=ValidadorDeTipo.ValidarString();
                }
                System.out.println("Ticket actualizado correctamente. ");
                return;
            }
        }
        System.out.println("Ticket no encontrado. ");
    }

    static public void eliminarTicket(){
        System.out.println("Ingrese el ID del ticket que desea eliminar: ");
        String idEliminar=ValidadorDeTipo.ValidarString();

        for (int i=0; i<ticketes.length; i++){
            if (ticketes[i][0] != null && ticketes[i][0].equals(idEliminar)){
                for (int j=0; j<ticketes[i].length;j++){
                    ticketes[i][j]=null;
                }
                System.out.println("Ticket eliminado correctamente: ");
                return;
            }
        }
        System.out.println("Ticket no encontrado.");
    }

    // array y matrices ventas
    static String [][] ventas=new String[1][5];

    //metodos de ventas
    static String[] encabezadosVentas={
            "idVenta","idTicket","cantidad","precioUnitario","total"
    };

    static public void crearVenta() {

        for (int i = 0; i < encabezadosVentas.length; i++) {
            System.out.println(encabezadosVentas[i]);
        }

        for (int i = 0; i < ventas.length; i++) {

            for (int j = 0; j < ventas[i].length -1; j++) {

                System.out.println("Ingrese dato de la venta " + encabezadosVentas[j] + ": ");
                ventas[i][j] = ValidadorDeTipo.ValidarString();

            }
            int cantidad= Integer.parseInt(ventas[i][2]);
            double precioUnitario=Double.parseDouble(ventas[i][3]);

            double total = cantidad*precioUnitario;

            ventas[i][4]=String.valueOf(total);

        }
    }

    static public void consultarVentas(){
        for(int i=0; i<encabezadosVentas.length;i++){
            System.out.print(encabezadosVentas[i]+"\t");
        }
        System.out.println();

        for (int i=0; i<ventas.length;i++){
            for (int j=0;j<ventas[i].length;j++){
                System.out.print(ventas[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static public void consultarVentasPorId(){
        System.out.println("Ingrese el ID de la venta: ");
        String idBuscarVenta=ValidadorDeTipo.ValidarString();

        for (int i=0; i<ventas.length;i++){
            if (ventas[i][0] !=null && ventas[i][0].equals(idBuscarVenta)){
                for (int j=0; j<ventas[i].length;j++){
                    System.out.println(encabezadosVentas[j]+ ": "+ventas[i][j]);
                }
                return;
            }
        }
        System.out.println("Venta no encontrada.");
    }

    static public void actualizarVentas() {
        System.out.println("Ingrese el ID de la venta que desea actualizar: ");
        String idBuscarVenta = ValidadorDeTipo.ValidarString();

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i][0] != null && ventas[i][0].equals(idBuscarVenta)) {
                for (int j = 1; j < ventas[i].length-1; j++) {
                    System.out.println("Ingrese nueva venta" + encabezadosVentas[j] + ": ");
                    ventas[i][j] = ValidadorDeTipo.ValidarString();
                }

                int cantidad = Integer.parseInt(ventas[i][2]);
                double precioUnitario = Double.parseDouble(ventas[i][3]);

                double total = cantidad * precioUnitario;

                ventas[i][4] = String.valueOf(total);

                System.out.println("Venta actualizada correctamente. ");
                return;
            }
        }
        System.out.println("Venta no encontrada. ");
    }


    static public void eliminarVenta(){
        System.out.println("Ingrese el ID de la venta que desea eliminar: ");
        String idEliminar=ValidadorDeTipo.ValidarString();

        for (int i=0; i<ventas.length; i++){
            if (ventas[i][0] != null && ventas[i][0].equals(idEliminar)){
                for (int j=0; j<ventas[i].length;j++){
                    ventas[i][j]=null;
                }
                System.out.println("Venta eliminada correctamente: ");
                return;
            }
        }
        System.out.println("Venta no encontrada.");
    }

    public static void registrarCajero() {

        if (rol == null && password == null) {

            System.out.println("Ingrese el tipo de usuario");
            rol = ValidadorDeTipo.ValidarString();

            System.out.println("Ingrese el password:");
            password = ValidadorDeTipo.ValidarString();

            System.out.println("Cajero registrado correctamente");

        } else {

            System.out.println("Ya existe un cajero registrado");

        }
    }

    public static void consultarCajero(){
        if (rol != null && password !=null){
            System.out.println("Rol del cajero: "+ rol);
        }else {
            System.out.println("No hay un cajero registrado");
        }
    }

    public static void actualizarCajero(){
        if (rol != null && password != null){
            System.out.println("Ingrese el nuevo rol del cajero:");
            rol=ValidadorDeTipo.ValidarString();

            System.out.println("Ingrese el nuevo password:");
            password=ValidadorDeTipo.ValidarString();

            System.out.println("Cajero actualizado correctamente");
        }else{
            System.out.println("No hay un cajero registrado");
        }

    }

    public static void eliminarCajero(){
        if (rol !=null && password !=null){
            rol=null;
            password=null;

            System.out.println("Cajero eliminado correctamente");
        }else {
            System.out.println("No hay un cajero registrado");
        }
    }

    public static boolean iniciarsesion() {

        if (rol != null && password != null) {

            System.out.println("Ingrese el usuario");
            String rolIngresado = ValidadorDeTipo.ValidarString();

            System.out.println("Ingrese el password:");
            String passwordIngresado = ValidadorDeTipo.ValidarString();

            if (rol.equals(rolIngresado) && password.equals(passwordIngresado)) {

                System.out.println("Inicio de sesion exitoso");
                return true;

            } else {

                System.out.println("Rol o password incorrectos");
                return false;

            }

        } else {

            System.out.println("No hay un cajero registrado");
            return false;

        }
    }



}

