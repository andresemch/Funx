all:
	antlr4 -Dlanguage=Python3 -no-listener -visitor funx.g4

app:
	export FLASK_APP=funxApp.py
	flask run

clean:
	