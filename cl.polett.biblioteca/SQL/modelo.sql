CREATE TABLE documento (
	codigo VARCHAR(255) NOT NULL,
	titulo VARCHAR(255) NOT NULL,
	autor VARCHAR(255) NOT NULL,
	editorial VARCHAR(255) NOT NULL,
	anio_publicacion INT NOT NULL,
	tipo_documento VARCHAR(255) NOT NULL,
	UNIQUE (codigo),
	PRIMARY KEY (codigo)
);

CREATE TABLE libro (
    codigo VARCHAR(255) NOT NULL,
	prestamo TINYINT(1) NOT NULL DEFAULT '0',
	FOREIGN KEY (codigo) REFERENCES documento(codigo) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE revista (
    codigo VARCHAR(255) NOT NULL,
	volumen INT NULL,
	numero INT NOT NULL,
	mes_salida VARCHAR(255) NOT NULL,
	FOREIGN KEY (codigo) REFERENCES documento(codigo) ON UPDATE CASCADE ON DELETE CASCADE
);