import java.io.StringReader;

import edu.stanford.nlp.process.*;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.process.PTBTokenizer.PTBTokenizerFactory;

public class DependencyExample {

	/*
	 * Tokenizer for 11-791 HW 0
	 * David Klaper
	 * accepts one string argument that will be tokenized by Stanford corenlp
	 */
	public static void main(String[] args)
	{
		TokenizerFactory<Word> factory = PTBTokenizerFactory.newTokenizerFactory();
		Tokenizer<Word> tokenizer = factory.getTokenizer(new StringReader(args[0]));
		System.out.println(tokenizer.tokenize());
	}
}
