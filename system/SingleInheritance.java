package org.system;

public class SingleInheritance
{
		public static class  Computer
			{
			public void computerModel()
			{
				System.out.println("hp mdoel");
			}
			}
		public static class Desktop extends Computer
			{
			public void desktopSize()
			{
				System.out.println("normal size");
			}
			}
		public static void main(String[] args) {
			Desktop com = new Desktop();
			com.desktopSize();
			com.computerModel();
		}
}