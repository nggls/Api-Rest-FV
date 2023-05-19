package com.maipogrande.apirest.fv.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "121212";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEpAIBAAKCAQEA0T4Sg+C2Q7Qp8XuzbLlca19t4uj/SPnxaVi4QgsLTJz4npN9\r\n"
			+ "w2LZqQV3gRGT3sDQ40l0UeS6PYF4P/fGb5WhF57QB+wZ6/1Tb3PoXHx1IRyBsP6/\r\n"
			+ "F02u92X0iGey///GKH3ZzmGmkvfFRuBq0jaAdKfs9U6PGiyJnDQrYZeqkOOb/19D\r\n"
			+ "dobP6FT7GOtmTFZtUhzEbTDe1xXcOSiYSamX0Fjn0/PqmX+rU4DZkzLInFSOQfVJ\r\n"
			+ "ncXaFia5XZy/3QQ0vePD8Hu9bfLQUZyUMPcJTxKTnAq/sz0mAekco+hwa9GC26VY\r\n"
			+ "V8j9Ya1arWbekzB1W3a7B3Mls/wtIAr8mNlUQQIDAQABAoIBAD6aa7+5Q88N4F63\r\n"
			+ "u/8Tlmspqh7xxy92WJxERxy7YS4S6O/JAR+sO6MuV4ruT2eeGOFn4L1/yZkNW4UI\r\n"
			+ "BP7trbz7bxJvuXG54XS/IQ5KzmCRvtvN3C6Et4ydnIQTQqMFS6xhuwDchpICP6vt\r\n"
			+ "CQjL9bLxaxwZ3QbfvGxXz4LrdcTTSiJHyUZ1X0arg7XEQflpKodPF3VN/suL9Mp2\r\n"
			+ "YGrNSpQygzHRBhffHuSNXmp/7H5dEdmsUiBIVFxFy1UlgdsBFjL3GTNa1Xa8khgC\r\n"
			+ "P+tWJIZxZ/8N3Zb9g7D0UMKQmwzqSWy9MM/Et1cOo9mrqutHJSP9lge4hPGf2BP9\r\n"
			+ "8YGhveECgYEA6NHT61SK7ff3TPEDh38ob18QVMJS63z3+QwpHKp2UGpz8RlDmCzs\r\n"
			+ "f8nvjBgR4WLrClat1Bh9tsMU8yrlVAUe8TkcBBPKlz4ZGuT0UoZshVuK8HLotc8T\r\n"
			+ "WBKFspLlMCC1jjmzyC+B1VlLV7ht6XC5zTW13bCJC3uVSprVBhl5JoMCgYEA5hNN\r\n"
			+ "kc99AkPIZOv0GBGn71ITCE/SgyfXfFDi7mTYIXbaUW/0Nrvi+9yMJV/+cuR56SUP\r\n"
			+ "8rFTkQnS5vTEsvcWO9dULS+swG9T5qnpOTzK21BOUPRqQWTNOq9B+AZXXLxCn2qa\r\n"
			+ "zKwEopq9XWdz77eWTIGhm8gndNo7hF0GQ2BP/usCgYEAuRW2Jys6lxu92cjwSVNp\r\n"
			+ "TcCBNyCU0uiyKablOAi7rgoyycSP2/Y6vQxIB1NLQ6ZjvABUiHw/1H8ZtIaxcS3w\r\n"
			+ "/0urXgJt1/Zh9uN05/Y9Z3by6Vwwa/iHJEj1SJVG5g/axYpRxh8eVAF8x+uyVRZs\r\n"
			+ "XxsHzYl+KUbB1GFqYEL38QkCgYEAurnt2aohFeZ3TFknmSUzO4tMARHvkxyRycZH\r\n"
			+ "9x0HQFmapD+NX6KrfKepYmf/NbXyr2KyB9EdNnhXn7QFtA3PELAZFDc+KEvyNyGt\r\n"
			+ "NBP/u3D4rsE/P2WVHszAaJCU9KGiHInDqtrtRB78E0N0F5jTNbJ7u9f9FdxMM4fg\r\n"
			+ "HmybYBMCgYB5GqdFHxsG7/HQAPV6hTQcCP6sfmGJJHHKjgijBo4ngVEyApvvS3oP\r\n"
			+ "06i4Z44wYZCJ8jc49/lEkIc5I5iYv+1pDAVL2qFc5Ne7TSULNNxzwtDDOzqLsWIZ\r\n"
			+ "kDS3ZsKOpeHStsYP3T4gS4BXvvILP2QxlfwAF88cJKnMnkOGRVqEPg==\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0T4Sg+C2Q7Qp8XuzbLlc\r\n"
			+ "a19t4uj/SPnxaVi4QgsLTJz4npN9w2LZqQV3gRGT3sDQ40l0UeS6PYF4P/fGb5Wh\r\n"
			+ "F57QB+wZ6/1Tb3PoXHx1IRyBsP6/F02u92X0iGey///GKH3ZzmGmkvfFRuBq0jaA\r\n"
			+ "dKfs9U6PGiyJnDQrYZeqkOOb/19DdobP6FT7GOtmTFZtUhzEbTDe1xXcOSiYSamX\r\n"
			+ "0Fjn0/PqmX+rU4DZkzLInFSOQfVJncXaFia5XZy/3QQ0vePD8Hu9bfLQUZyUMPcJ\r\n"
			+ "TxKTnAq/sz0mAekco+hwa9GC26VYV8j9Ya1arWbekzB1W3a7B3Mls/wtIAr8mNlU\r\n"
			+ "QQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
