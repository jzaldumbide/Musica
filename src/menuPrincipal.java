public class menuPrincipal {
    public static void main(String[] args) {
        Genero rock=new Genero("rock",
                "120bpm",
                1950,
                "EU",
                "Chuck Berry",
                "festival de California");

  //enviar el código de un objeto por estudiante
        Genero rap = new Genero("rap",
                "80bpm",
                2000,
                "EU",
                "Marck Lutom",
                "Batalla de gallos" );
        Genero Kpop=new Genero(
                "k-pop",
                "110bpm",
                1990,
                "South Korea",
                "Jungkook",
                "festival Dia blanco");


        //System.out.println(rock.getAnio());
        //System.out.println(rap.getAnio());
        //System.out.println(Kpop.getAnio());

        //System.out.println(rock.getAnio()+rap.getAnio()+ Kpop.getAnio());
//ingreso de datos.
        //int aniotemporal=2010;
        //rock.setAnio(aniotemporal);
        //rap.setAnio(2000);
        //Kpop.setAnio(2010);

        //System.out.println(rock.getAnio());
        //System.out.println(rap.getAnio());
        //System.out.println(Kpop.getAnio());
rock.imprimirDatos();
rap.imprimirDatos();
    }
}
