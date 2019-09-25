import Planes.experimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import java.util.*;

public class Airport {
    private List<? extends Plane> planes;

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlane = new ArrayList<>();
        for (Plane plane : this.planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlane.add((PassengerPlane) plane);
            }
        }
        return passengerPlane;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlane = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                 militaryPlane.add((MilitaryPlane) plane);
            }
        }
        return militaryPlane;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        PassengerPlane planeWithMaxCapacity = getPassengerPlane().get(0);
        for (int i = 0; i < getPassengerPlane().size(); i++) {
            if (getPassengerPlane().get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = getPassengerPlane().get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
    List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
    for (int i = 0; i < getMilitaryPlanes().size(); i++) {
        if (getMilitaryPlanes().get(i).getType() == MilitaryType.TRANSPORT)
             transportMilitaryPlanes.add(getMilitaryPlanes().get(i));
    }
    return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (int i = 0; i < getMilitaryPlanes().size(); i++) {
            if (getMilitaryPlanes().get(i).getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(getMilitaryPlanes().get(i));
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<experimentalPlane> getExperimentalPlanes() {
        List<experimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof experimentalPlane) {
                experimentalPlanes.add((experimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane from, Plane to) {
                return from.getMaxFlightDistance() - to.getMaxFlightDistance();
            }
        });
        return this;
    }
    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane from, Plane to) {
                return from.getMaxSpeed() - to.getMaxSpeed();
            }
        });
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane from, Plane to) {
                return from.getMaxLoadCapacity() - to.getMaxLoadCapacity();
            }
        });
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    @Override
    public String toString() {
        return " Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
