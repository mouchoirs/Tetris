package tetris.java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class TetriminoApplicationDAO {
	private static Map<String, Tetrimino> tetriminos = new HashMap<String, Tetrimino>();


	public static List<Tetrimino> findAll() {
		return new ArrayList<>(tetriminos.values());
	}
}