package oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.SimpleTimeLimiter;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;

/**
 * OUr App. This will count the number of files within a directory, and sub dirs,
 * and also calculate the total size of all o fthe files.
 */
public final class HelloWorld {

    /**
     * Runs the application. This will count the files
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {
	ImmutableMap.Builder<String, Object> theParams = ImmutableMap.<String, Object>builder();

        Multimap<String, String> callingMethodToMethodInvocationMultiMap = LinkedHashMultimap
                        .create();
        Multimap<String, String> classNameToFieldTypesMultiMap = LinkedHashMultimap
                        .create();
        System.out.println("Hello " + theParams.getClass().toString());
        System.out.println("Hello " +callingMethodToMethodInvocationMultiMap.getClass().toString());
        System.out.println("Hello " +classNameToFieldTypesMultiMap.getClass().toString());

		read: {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
    }
}
