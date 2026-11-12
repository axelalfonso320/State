package State;

public class EstadoEnviado implements EstadoPedido {
    @Override
    public void procesar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya fue procesado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("ERROR: No se puede cancelar un pedido ya enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("ERROR: El pedido ya fue enviado");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Entregando pedido...");
        pedido.setEstado(new EstadoEntregado());
    }
}
