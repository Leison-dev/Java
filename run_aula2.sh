#!/usr/bin/env bash
set -euo pipefail
# Compila e executa Aulas JAVA/aula2.java a partir da raiz do repositório
ROOT_DIR="$(cd "$(dirname "$0")" && pwd)"
SOURCE_DIR="$ROOT_DIR/Aulas JAVA"
javac "$SOURCE_DIR/aula2.java"
java -cp "$SOURCE_DIR" aula2
