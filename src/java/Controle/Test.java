/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.DaoJpa;
import Entity.Utilisateur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zohan
 */
public class Test extends HttpServlet {
    
    private DaoJpa agent;
    private List<Utilisateur> list;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Test</title>");            
            out.println("</head>");
            out.println("<body>");
    
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        agent = new DaoJpa();
        agent.init();
        
       // Medecins m = new Medecins(new Long(7),"Spec 3","Signi","Hichem");
        
      //  m = agent.Ajouter_Medecin(m);
        
       // agent.Modifier_Medecin(m);
        
     //   agent.Supprimer_Medecin(m.getId());
        
    /*    List<Medecins> l = agent.Trouver_Med("Ahmed", "Tounsi");
       processRequest(request, response,l);
       */
      /*  Medecins mr = agent.getMedecinById(new Long(8));
        Clients cr = agent.getClientById(new Long(3));
        Rv rdv = new Rv(new Long(3),"23/11/2200");
        rdv.setIdMedecin(mr);
        rdv.setIdClient(cr);
        rdv = agent.Ajouter_RDV(rdv);*/
      list = agent.Authentification("anisLokil@gmail.com", "anisanis");
      if(list.isEmpty()){
             RequestDispatcher rd=request.getRequestDispatcher("/valide.html");  
        rd.forward(request, response);  
      }else{
          RequestDispatcher rd=request.getRequestDispatcher("/index_1.html");  
        rd.forward(request, response);  
      }
        processRequest(request, response);
        agent.close();
        
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        /*
        Long id = new Long(Integer.parseInt(request.getParameter("id")));
        
        String spec = request.getParameter("spec");
        String nom  = request.getParameter("nom");
        String pre = request.getParameter("pre");
        Medecins m = new Medecins(id,spec,nom,pre);
        agent = new DaoJpa();
        agent.init();
        m = agent.Ajouter_Medecin(m);
        agent.close();
        
          //  processRequest(request, response);*/
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
