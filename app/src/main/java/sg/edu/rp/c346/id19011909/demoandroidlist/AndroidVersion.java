package sg.edu.rp.c346.id19011909.demoandroidlist;

public class AndroidVersion {

    //Creating Variable,
    private String name;
    private String version;

    //Creating Constructor,
    public AndroidVersion(String Name, String Version) {
        this.name = Name;
        this.version = Version;
    }

    //Setting Classes,
    public String getName()
    {   return name;        }

    public String getVersion()
    {   return version;     }

    public void setName(String name)
    {   this.name = name;       }

    public void setVersion(String version)
    {   this.version = version;     }

    @Override
    public String toString()
    {   return name + ": " + version;       }
}
