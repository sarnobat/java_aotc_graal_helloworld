package oracle;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.SimpleTimeLimiter;

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

        System.out.println("Hello " + theParams.toString());
    }
}
