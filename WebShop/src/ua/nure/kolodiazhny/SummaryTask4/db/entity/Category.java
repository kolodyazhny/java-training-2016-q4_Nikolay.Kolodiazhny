package ua.nure.kolodiazhny.SummaryTask4.db.entity;

/**
 * Category entity.
 *
 * @author Nikolay Kolodiazhny
 *
 */
public class Category extends Entity {

	private static final long serialVersionUID = 6307171020118375922L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [name=" + name + ", getId()=" + getId() + "]";
	}

}
