# XOR Encryption Project

**Course:** Object-Oriented Programming & Data Structures (CS303A)  
**Institution:** Northeastern Illinois University  

## Project Overview
This project implements file encryption and decryption using the XOR
(Exclusive OR) encryption algorithm.

The program reads a data file and a key file as byte streams, applies
the XOR operation to encrypt the data, and writes the encrypted output
to a file. Running the program again on the encrypted file decrypts it.

## Concepts Demonstrated
- XOR bitwise encryption
- FileInputStream and FileOutputStream
- Byte array manipulation
- Exception handling (checked vs unchecked exceptions)
- Java file I/O

## How It Works
- Each byte of the data file is XORed with a corresponding byte from the key file
- If the key is shorter than the data, the key repeats using modulo arithmetic
- XOR encryption is reversible, allowing decryption using the same key
