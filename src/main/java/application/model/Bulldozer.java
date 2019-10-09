package application.model;

public class Bulldozer {

    private static Bulldozer bulldozerRef = new Bulldozer();

    private Position position;
    private Direction direction;
    private Integer fuelUsed;
    private Boolean statusOk = true;

    public static Bulldozer getRef() {
        return bulldozerRef;
    }

    private Bulldozer() {
        position = new Position(-1,0);
        direction = Direction.East;
        fuelUsed = 0;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Integer getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(Integer fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public Boolean getStatusOk() {
        return statusOk;
    }

    public void setStatusOk(Boolean statusOk) {
        this.statusOk = statusOk;
    }

    public void advance(Integer amount) {
        for (int i=0; (i < amount) && checkConstraints(); i++) {
            fuelUsed++;
            switch (direction) {
                case East:
                    position.setX(position.getX() + 1);
                    break;
                case North:
                    position.setY(position.getY() - 1);
                    break;
                case West:
                    position.setX(position.getX() - 1);
                    break;
                case South:
                    position.setY(position.getY() + 1);
                    break;
            }
            checkConstraints();
        }
    }

    private boolean checkConstraints() {
        return true;
    }
}
