package flappy;


    public abstract class Column  {

        private String name;

        private Integer shield;

        private Integer xCord;

        private Integer yCord;

        private Integer height;

        private static Bird player;

        public Column( String n, Integer h, Integer s, Integer x, Integer y, Bird bird ) {
            name = n;
            height = h;
            shield  = s;
            xCord = x;
            yCord = y;
            player = bird;
        }

        public void move( )
        {
            System.out.println("column" + name + " have moved" + height + " px up");
            System.out.println("x position : "+ xCord +"; y position: "+ yCord);
        }


        public void alert(){
            int xpos = player.getxPosition();
            int ypos = player.getyPosition();
            Double dist = Math.sqrt(Math.pow((xpos - xCord), 2) + Math.pow((ypos - yCord), 2));
            System.out.println("Distance from " +name +" to column is " + dist.intValue());
        }
    }

