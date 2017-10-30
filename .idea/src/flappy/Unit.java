package flappy;

public abstract class Unit
{
    private String name;

    private Integer distance;

    private Integer damage;

    public Unit( String n, Integer d, Integer dm ) {
        name = n;
        distance = d;
        dm = damage;
    }

    public void move( )
    {
        System.out.println("Unit " + name + " is moving at " + distance);
    }

    public void shoot( )
    {
        System.out.println("Unit " + name + " is shooting " + damage);
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getDistance( ) {
        return distance;
    }

    public void setDistance( Integer distance ) {
        this.distance = distance;
    }

    public Integer getDamage( ) {
        return damage;
    }

    public void setDamage( Integer damage ) {
        this.damage = damage;
    }


}

