package flappy;

public class ColumnFactory {

        public Column createColumn( int columnType, int x, int y, Bird bird )
        {

            if(columnType==1) {
                return new RectColumn("Rectangular column", 1, 3, x, y, bird);
            }
            if(columnType==2) {
                return new TriangColumn("Triangle column", 3, 1, x, y, bird);
            }
            if(columnType==3) {
                return new RoundColumn("Round column", 2, 2, x, y, bird);
            }
            return null;
        }

}
