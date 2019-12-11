package es.upm.miw.iwvg.ecosystem.practicas;

public class Point3D {

    private int x;
    private int y;
    private int z;

    public Point3D(Point point2D, int z) {
        this.x = point2D.getX();
        this.y = point2D.getY();
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this(new Point(), 0);
    }

    public void translateOrigin(Point3D origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.z -= origin.getZ();
    }

    public double module() {
        return Math.sqrt((double)
                this.x * this.x +
                this.y * this.y +
                this.z * this.z
        );
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ",y=" + y +
                ",z=" + z +
                '}';
    }
}
