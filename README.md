# Desafio Java - Artistas e Músicas
Implementar uma aplicação para armazenar dados de nossos artistas e músicas preferidos em um banco de dados relacional, podendo buscar informações por artistas e consultar dados sobre os mesmos através de integração com outra API.

## 🔨 Objetivos do projeto

- O objetivo do projeto é praticar a modelagem de classes e relacionamentos utilizando o Spring Data JPA;
- É importante descrever e implementar corretamente a relação entre Artista e Música, visto que um artista pode estar associado a mais de uma música;
- Uma música só deve ser salva no banco de dados, caso o Artista tenha sido previamente cadastrado;
- Praticaremos *derived queries* e *JPQL* para verificar se o artista já está cadastrado e buscar músicas por um determinado artista;
- Faremos a integração com outra API para buscar informações sobre um determinado artista.
