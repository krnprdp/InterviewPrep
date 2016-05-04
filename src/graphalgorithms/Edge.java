package graphalgorithms;

public class Edge<E> {

	private E vertex;
	private int weight;

	public Edge(E vert, int w) {
		vertex = vert;
		weight = w;
	}

	public void setVertex(E vert) {
		this.vertex = vert;
	}

	public void setWeight(int w) {
		this.weight = w;
	}

	public E getVertex() {
		return vertex;
	}

	public int getWeight() {
		return weight;
	}

	public String toString() {
		return "( " + vertex + ", " + weight + " )";
	}
}
