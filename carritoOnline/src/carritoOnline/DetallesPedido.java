package carritoOnline;

public class DetallesPedido { //Clase referente a los detalles del pedido
	
	//Variables de datos del pedido
	private int orderId, productId;
	private String productName;
	private int quantily;
	private float unitCost, subTotal;
	
	public float calcPrice() {
		//m�todos para calcular el precio final
		return subTotal; //Lo que tendr� que retornar es el calculo total de la compra
	}

}
