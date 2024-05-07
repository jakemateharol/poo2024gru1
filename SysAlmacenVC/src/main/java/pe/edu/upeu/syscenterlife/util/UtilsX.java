
package pe.edu.upeu.syscenterlife.util;

import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author Datos
 */
public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }

    public File getFileExterno(String carpeta, String filex) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/" + filex);
        return CAMINO.toFile();
    }

    public File getFolderExterno(String carpeta) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/");
        return CAMINO.toFile();
    }

    public Properties detectLanguage(String get) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String readLanguageFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
