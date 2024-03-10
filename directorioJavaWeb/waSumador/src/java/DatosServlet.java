/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Cliente;
import logica.Proveedor;
import logica.Sumador;

/**
 *
 * @author alejo
 */
public class DatosServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
       response.setContentType("text/html;charset=UFT-8");
       String botonPresionado = request.getParameter("boton");
       
        Proveedor p = new Proveedor();
        Cliente c = new Cliente();

        response.setContentType("text/html;charset=UTF-8");
        
        /*
        p.setNombreProv(request.getParameter("nombreProv"));
        p.setTelefonoProv(request.getParameter("telefonoProv"));
        p.setDireccionProv(request.getParameter("direccionProv"));
        p.setSectorProv(request.getParameter("sectorProv"));
        p.setMetodoPagoProv(request.getParameter("metodoPagoProv"));*/
        
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            
                out.println("<head>");
                    out.println("<title>Datos Recibidos</title>");  
                out.println("</head>");
                
            out.println("<body>");
                out.println("<h1>Servlet Sumador</h1>");
                
                if (botonPresionado != null) {
                         if (botonPresionado.equals("Enviar Datos de Proveedores")) {
                                out.println("<h1>Proveedores</h1>");
                                
                                p.setNombreProv("Nombre: " + request.getParameter("nombreProv"));
                                p.setTelefonoProv("Telefono: " + request.getParameter("telefonoProv"));
                                p.setDireccionProv("Direccion: " + request.getParameter("direccionProv"));
                                p.setSectorProv("Sector: " + request.getParameter("sectorProv"));
                                p.setMetodoPagoProv("Metodo de Pago: " + request.getParameter("metodoPagoProv"));
                                
                                out.println(p.getNombreProv());
                                out.println(p.getTelefonoProv());
                                out.println(p.getSectorProv());
                                out.println(p.getDireccionProv());
                                out.println(p.getMetodoPagoProv());
                                
                                
                                
                        } else if (botonPresionado.equals("Enviar Datos de Clientes")) {
                                out.println("<h1>Clientes</h1>");
                                c.setNombreCli(request.getParameter("nombreCli"));
                                c.setTelefonoCli(request.getParameter("telefonoCli"));
                                c.setDireccionCli(request.getParameter("direccionCli"));

                                c.setMetodoPagoCli(request.getParameter("metodoPagoCli"));
       
                                 
                                out.println("Nombre: " + c.getNombreCli());
                                out.println("Telefono: " + c.getTelefonoCli());
                                out.println("Direccion: " + c.getDireccionCli());

                                out.println("Metodo de Pago: " + c.getMetodoPagoCli());

                            
                        } 
                         
                    }
                out.println("<p><a href='index.jsp'>regresar</a></p>");
            out.println("</body>");
            out.println("</html>");
            
            

        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);

    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
