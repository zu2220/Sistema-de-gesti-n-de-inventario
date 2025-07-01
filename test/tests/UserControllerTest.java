package tests;

import modelo.Usuario;
import controlador.Ctrl_Usuario;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Assert;
import java.sql.*;

public class UserControllerTest {
    private static Ctrl_Usuario ctrl_usuario;
    private static Usuario usuario;
    
    @BeforeClass
    public static void setUpConnection(){
        ctrl_usuario = new Ctrl_Usuario();
        usuario = new Usuario(
        "oscar",
        "zari",
        "ozari",
        "123",
        "123456789",
        0);
    }
    
        // TODO code application logic here
    @Test
    public void testGuardarUsuario() throws Exception {
        boolean flag = ctrl_usuario.guardar(usuario);
        Assert.assertTrue(flag);
    }
    
    @AfterClass
    public static void tearDown() throws Exception {
        ctrl_usuario.eliminar(usuario.getIdUsuario());
    }
        
}
