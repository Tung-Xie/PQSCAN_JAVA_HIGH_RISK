# PQSCAN_JAVA_HIGH_RISK

## 🎯 預期掃描結果 (High Risk / Legacy)
依照 NIST SP800-57 規範，以下資產應被偵測為 High Risk:

- **PKI**: RSA-1024, RSA-2048, DSA, GOST R 34.10
- **Cipher**: 3DES (DESede), RC-4
- **Hash**: MD5, SHA-1, SHA224
- **KEX/Curves**: secp160/192/224 系列, sect 系列, ffdhe2048
