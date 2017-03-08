
import java.util.Map;
import java.util.TreeMap;

public class MapOfServices {

	private Map<String, Integer> classesOverview = new TreeMap<>();

	public Map<String, Integer> getClassesOverview() {
		return classesOverview;
	}

	public void setClassesOverview(Map<String, Integer> classesOverview) {
		this.classesOverview = classesOverview;
	}

	public MapOfServices() {

	}

	public MapOfServices(Map<String, Integer> classesOverview) {
		super();
		this.classesOverview = classesOverview;
	}

	@Override
	public String toString() {
		return "MapOfServices [classesOverview=" + classesOverview + "]";
	}

	public void addToMap(String s, Integer i) {

		classesOverview.put(s, i);

	}

}
