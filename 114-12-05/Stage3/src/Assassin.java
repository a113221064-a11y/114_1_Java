
  public class Assassin extends Role {

        public Assassin(String name) {
            super(name, 90, 28, 10);
        }

        @Override
        public void useSkill() {
            System.out.println(name + " 使用「背刺」！造成致命一擊！");
        }
    }

}
