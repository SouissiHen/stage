package Entity;

import Entity.Jury;
import Entity.Soutenance;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-20T14:39:10")
@StaticMetamodel(SessionSoutenance.class)
public class SessionSoutenance_ { 

    public static volatile SingularAttribute<SessionSoutenance, String> idsessionS;
    public static volatile SingularAttribute<SessionSoutenance, Date> dateDebut;
    public static volatile ListAttribute<SessionSoutenance, Soutenance> soutenanceList;
    public static volatile SingularAttribute<SessionSoutenance, Date> dateFin;
    public static volatile ListAttribute<SessionSoutenance, Jury> juryList;

}