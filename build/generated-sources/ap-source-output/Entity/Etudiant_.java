package Entity;

import Entity.Rapports;
import Entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(Etudiant.class)
public class Etudiant_ { 

    public static volatile SingularAttribute<Etudiant, String> classe;
    public static volatile ListAttribute<Etudiant, Rapports> rapportsList;
    public static volatile SingularAttribute<Etudiant, Integer> numInscript;
    public static volatile SingularAttribute<Etudiant, Utilisateur> login;
    public static volatile SingularAttribute<Etudiant, String> nom;
    public static volatile SingularAttribute<Etudiant, String> prenom;

}