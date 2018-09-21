package aplicacao;

public class CDB {
	public int prazo;
	public float valor_inicial;
	public float juros_anual;
	public float aliquota_ir;
	
	public CDB(int prazo, float valor_inicial, float juros_anual, float aliquota_ir) {
		this.prazo = prazo;
		this.valor_inicial = valor_inicial;
		this.juros_anual = juros_anual;
		this.aliquota_ir = aliquota_ir;
	}
	
	public static float calculaRendimentoBruto(float valor_inicial, float juros_anual) {
		return 13.97f;
	}
	
	public static float calculaImpostoDeRenda(float renda_bruta, float aliquota_ir) {
		return 3.14f;
	}
	
	public static float calculaRendimentoLiquido(float valor_inicial, float renda_bruta) {
		return 1.0829f;
	}
	
}
