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
	
	public static float calculaRendimentoBruto(float valor_inicial, float juros_anual, int prazo) {
		float renda_bruta = valor_inicial * (((juros_anual/360.00f) * prazo)/100.00f); 
		
		return renda_bruta;
	}
	
	public static float calculaImpostoDeRenda(float renda_bruta, float aliquota_ir) {
		float imposto_renda = renda_bruta * (aliquota_ir/100.00f);
		return imposto_renda;
	}
	
	public static float calculaRendimentoLiquido(float valor_inicial, float renda_bruta, float imposto_renda) {
		float renda_liquida = renda_bruta - imposto_renda;
		float renda_liquida_pct = ((renda_liquida/valor_inicial) * 100.00f);
		
		return renda_liquida_pct;
	}
	
}
